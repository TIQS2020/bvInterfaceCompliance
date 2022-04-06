package br.com.bv.nfe.vo.nfEFD;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpImpostos;

public class TpImpostoVO {

	public static TpImpostos montaImposto(NonNegativeInteger codImposto, NonNegativeInteger tipo, String codSt,
			BigDecimal vlBaseCalc, BigDecimal aliquota, BigDecimal vlImpTrib, String naturezaReceitaPisCofins,
			Integer tipoRetencaoImposto)
			throws Exception {

		TpImpostos imposto = new TpImpostos();

		imposto.setCodImposto(codImposto);
		imposto.setTipo(tipo);
		if (codImposto.compareTo(new BigInteger("4")) == 0 || codImposto.compareTo(new BigInteger("5")) == 0) {
			imposto.setCodSt(codSt);
		}

		imposto.setVlBaseCalc(vlBaseCalc.divide(new BigDecimal(100)));

		if (codImposto.compareTo(new BigInteger("12")) == 0 || (codImposto.compareTo(new BigInteger("6")) == 0
				&& tipo.compareTo(new NonNegativeInteger("1")) == 0)) {
			imposto.setAliquota(aliquota.divide(new BigDecimal(1000)));
		} else {
			imposto.setAliquota(aliquota.divide(new BigDecimal(100000)));
		}
		imposto.setVlImpTrib(vlImpTrib.divide(new BigDecimal(100)));
//		imposto.setVlDeducao(vlDeducao);
		imposto.setNaturezaReceitaPisCofins(new NonNegativeInteger(naturezaReceitaPisCofins));
		if(tipoRetencaoImposto != null) {
			imposto.setTipoRetencaoImposto(tipoRetencaoImposto.toString());	
		}		
//		imposto.setCodReceita(codReceita);

//		TpAposentEspecial aposentEspecial = new TpAposentEspecial(BigDecimal.TEN, BigDecimal.TEN);
//		imposto.setAposentEspecial(aposentEspecial);

		return imposto;

	}

}
