package br.com.bv.nfe.vo.nfServico;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC90;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpFormaPgto;

public class TpFormaPgtoVO {
	
	private static final Logger log = LogManager.getLogger(NfServicoVO.class.getClass());		
	
	public static TpFormaPgto montaFormaPgto(F55IJC90 pg, F55IJC80 header) throws Exception{	
		
		log.info("## INICIO MONTANDO FORMA DE PAGAMENTO ##");
		
		TpFormaPgto tpFormaPgto = new TpFormaPgto();
		
		tpFormaPgto.setDmTpPag(new BigInteger(pg.getJCAA02()));
		
		log.info("dmTpPag: " + pg.getJCAA02());
		
		if(pg.getJCBVTN() != null){
			tpFormaPgto.setVlPgto(pg.getJCBVTN().divide(new BigDecimal(100)));
			
			log.info("tpFormaPgto: " + pg.getJCBVTN().divide(new BigDecimal(100)));
			
		}
		
		log.info("## FIM MONTANDO FORMA DE PAGAMENTO ##");
		
		/*
		if(pg.getCPKY3() != null && 
				!pg.getCPKY3().isEmpty()){
			tpFormaPgto.setCnpj(pg.getCPKY3());
		}
		
		if(pg.getCPLEN3() != null &&
				pg.getCPLEN3() != 0){
			tpFormaPgto.setDmTpBand(pg.getCPLEN3().toString());
		}
		
		if(pg.getCPVCTR() != null &&
				pg.getCPVCTR() != 0){
			tpFormaPgto.setDmTpIntegra(new BigInteger(pg.getCPVCTR().toString()));
		}
		
		if(pg.getCPLEN2() != null){
			tpFormaPgto.setDmTpPag(new BigInteger(pg.getCPLEN2().toString()));
			if(pg.getCPLEN2() == 1){
				if(pg.getCPAEXP() != null){
					tpFormaPgto.setVlTroco(pg.getCPAEXP());
				}	
			}
		}
		
		if(pg.getCPGS2B() != null &&
				!pg.getCPGS2B().isEmpty()){
			tpFormaPgto.setNroAut(pg.getCPGS2B());
		}
		
		if(pg.getCPBVTN() != null){
			tpFormaPgto.setVlPgto(pg.getCPBVTN().divide(new BigDecimal(100)));
		}			
		*/
		return tpFormaPgto;
		
		
	}

}
