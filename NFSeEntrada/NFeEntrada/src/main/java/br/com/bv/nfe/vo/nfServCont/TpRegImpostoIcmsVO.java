package br.com.bv.nfe.vo.nfServCont;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliance.nfe.jde.domain.F55IJC70;
import br.com.compliance.nfe.jde.domain.F55IJC71;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoIcms;

public class TpRegImpostoIcmsVO {	

	public static TpRegImpostoIcms montaIcms(F55IJC71 it, F55IJC70 header) throws Exception {
		TpRegImpostoIcms icms = new TpRegImpostoIcms();
		
		icms.setVlRedBcIcms(it.getJCBBIR());
		icms.setCodStIcms(it.getJCBSTT()); //TODO: [MAPEAMENTO] CAMPO NÃO EXISTE NA TABELA COMO FDBST1 NEM JCBST1 
		icms.setCfop(new NonNegativeInteger(it.getJCBRNOP()));
		icms.setDmOrigMerc(new BigInteger(it.getJCBORI()));
		//icms.setVlOper(it.getJCBICM().divide(new BigDecimal("100")));
		icms.setVlOper(header.getJCBVTN().divide(new BigDecimal("100")));
		icms.setAliquota(it.getJCTXR1()); //TODO: [MAPEAMENTO] CAMPO NÃO EXISTE JCTX01
		icms.setVlBcIcms(header.getJCBBCL().divide(new BigDecimal("100")));
		icms.setVlIcms(it.getJCBICM().divide(new BigDecimal("100"))); //TODO: [MAPEAMENTO] CAMPO NÃO EXISTE JCBCIM
			
		return icms;
	}

}
