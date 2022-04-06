package br.com.bv.nfe.vo.nfMercantil;

import java.math.BigDecimal;

import br.com.compliance.nfe.jde.domain.F55IJC83;
import br.com.compliance.nfe.util.DateUtil;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDuplicatas;

public class TpDuplicatasVO {

	public static TpDuplicatas montaDuplicata(F55IJC83 f) throws Exception{
		DateUtil dateUtil = new DateUtil();
		TpDuplicatas d = new TpDuplicatas();				
		d.setDtVencto(dateUtil.getDateFormated((dateUtil.julianToRegular(f.getJCDDJ()))));				
		d.setNroParcela(f.getJCCRPR());
		d.setVlDuplicata(f.getJCAEXP().divide(new BigDecimal("100")));	
		return d;
	}

}
