package br.com.nfe.util;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Locale;

public class BigDecimalAdapter extends XmlAdapter<String, BigDecimal> {

    private static final DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
    private static final DecimalFormat decimalFormat = new DecimalFormat("#,##0.00", symbols);

    static {
        decimalFormat.setParseBigDecimal(true);
    }

    @Override
    public BigDecimal unmarshal(String v) throws Exception {
        if (v == null || v.trim().isEmpty()) {
            return null;
        }
        try {
            if(v.contains(".")){
                return new BigDecimal(v);
            }else{
                return (BigDecimal) decimalFormat.parse(v);
            }

        } catch (ParseException e) {
            throw new IllegalArgumentException("Erro ao converter o valor para BigDecimal: " + v, e);
        }
    }

    @Override
    public String marshal(BigDecimal v) throws Exception {
        return v != null ? decimalFormat.format(v) : null;
    }
}
