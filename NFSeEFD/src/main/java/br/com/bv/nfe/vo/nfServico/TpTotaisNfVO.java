package br.com.bv.nfe.vo.nfServico;

import java.math.BigDecimal;

import br.com.compliance.nfe.jde.domain.F55IJC70;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpTotaisNf;

public class TpTotaisNfVO {

	public static TpTotaisNf montaTotaisNf(F55IJC70 header) throws Exception{
		// TODO Auto-generated method stub
		TpTotaisNf totaisNf = new TpTotaisNf();
		totaisNf.setVlBaseCalcIcms(header.getJCBBCL().divide(new BigDecimal("100")));
		totaisNf.setVlImpTribIcms(header.getJCBICM().divide(new BigDecimal("100")));
		totaisNf.setVlBaseCalcIcmsSt(header.getJCBBIS().divide(new BigDecimal("100")));
		totaisNf.setVlImpTribIcmsSt(header.getJCBVIS().divide(new BigDecimal("100")));
		totaisNf.setVlFrete(header.getJCBFRT().divide(new BigDecimal("100")));
		totaisNf.setVlSeguro(header.getJCBSEG().divide(new BigDecimal("100")));
		totaisNf.setVlDesconto(header.getJCBDES().divide(new BigDecimal("100")));
		totaisNf.setVlImpTribII(header.getJCBIIT().divide(new BigDecimal("100")));
		totaisNf.setVlImpTribIpi(header.getJCBIPI().divide(new BigDecimal("100")));
		totaisNf.setVlImpTribPis(header.getJCAN01().divide(new BigDecimal("100")));
		totaisNf.setVlImpTribCofins(header.getJCAN02().divide(new BigDecimal("100")));
		totaisNf.setVlOutrasDespesas(header.getJCBDFN().divide(new BigDecimal("100")));
		totaisNf.setVlTotalNf(header.getJCBVTN().divide(new BigDecimal("100")));
		totaisNf.setVlTotalItem(header.getJCGDVL().divide(new BigDecimal("100")));
		//totaisNf.setVlTotTrib(header.getJCBVTN().divide(new BigDecimal("100")));
		totaisNf.setVlTotTrib(new BigDecimal("0"));
		return totaisNf;
	}

}
