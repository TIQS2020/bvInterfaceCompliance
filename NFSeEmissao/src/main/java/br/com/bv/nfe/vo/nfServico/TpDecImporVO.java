package br.com.bv.nfe.vo.nfServico;

import java.math.BigDecimal;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliance.nfe.jde.domain.F55IJC85;
import br.com.compliance.nfe.util.DateUtil;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDecImpor;

public class TpDecImporVO {
	
	public static TpDecImpor montaImport(F55IJC85 ip) throws Exception{
		DateUtil dateUtil = new DateUtil();
		TpDecImpor imp = new TpDecImpor();
		imp.setNroDi(ip.getJCAA16());
		//TODO: converter pra juliana Formato: RRRR-MM-DD
		imp.setDtDi(dateUtil.getDateFormated((dateUtil.julianToRegular(ip.getJCTRDJ()))));
		imp.setLocalDesemb(ip.getJCBRD60());
		imp.setUfDesemb(ip.getJCADDS());
		//TODO: converter pra juliana Formato: RRRR-MM-DD
		imp.setDtDesemb(dateUtil.getDateFormated((dateUtil.julianToRegular(ip.getJCRSDJ()))));
		imp.setCodPartExport(ip.getJCSQNR().toString());
		imp.setDmCodDocImp(new NonNegativeInteger(ip.getJCAA01())); //TODO: a definir
		imp.setNumAcdraw(ip.getJCAA11()); //TODO: a definir
		imp.setDmTpViaTransp(new NonNegativeInteger(ip.getJCURCD())); //TODO: a definir
		imp.setVlVafrmm(ip.getJCURAT().divide(new BigDecimal("100"))); //TODO: a definir
		imp.setDmTpIntermedio(new NonNegativeInteger(ip.getJCASG1().toString())); //TODO: a definir
		imp.setCnpj(ip.getJCAA15()); //TODO: a definir
		imp.setUfTerceiro(ip.getJCSHST()); //TODO: a definir
		
		
		return imp;
	}

}
