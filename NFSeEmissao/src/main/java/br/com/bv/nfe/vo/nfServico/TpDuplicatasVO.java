package br.com.bv.nfe.vo.nfServico;

import java.math.BigDecimal;

import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC83;
import br.com.compliance.nfe.util.DateUtil;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDuplicatas;

public class TpDuplicatasVO {

	public static TpDuplicatas montaDuplicata(F55IJC83 f, F55IJC80 header) throws Exception{
		DateUtil dateUtil = new DateUtil();
		TpDuplicatas d = new TpDuplicatas();				
		d.setDtVencto(dateUtil.getDateFormated((dateUtil.julianToRegular(f.getJCDDJ()))));				
		//d.setNroParcela(header.getJCBNNF().toString() + header.getJCBSER() + " - " + f.getJCCRPR());
		/*
		if(f.getJCURAB().toString().length() == 1){
			d.setNroParcela("00" + f.getJCURAB().toString());
		}else if(f.getJCURAB().toString().length() == 2){
			d.setNroParcela("0" + f.getJCURAB().toString());
		}else{
			d.setNroParcela(f.getJCURAB().toString());
		}
		*/
		
		d.setNroParcela(f.getJCKI03());
		
		d.setVlDuplicata(f.getJCAEXP().divide(new BigDecimal("100")));	
		return d;
	}

}
