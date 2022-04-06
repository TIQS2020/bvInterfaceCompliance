package br.com.bv.nfe.vo.nfServCont;

import java.math.BigDecimal;

import br.com.compliance.nfe.jde.domain.F55IJC71;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoPis;

public class TpRegImpostoPisVO {

	public static TpRegImpostoPis montaPis(F55IJC71 it) {
		TpRegImpostoPis pis = new TpRegImpostoPis();
		
		pis.setCodStPis(it.getJCURC1()); //TODO: [MAPEAMENTO] CAMPO 76TSPIS N�O EXISTE NA TABELA
		pis.setVlItem(it.getJCAEXP().divide(new BigDecimal("100")));
		pis.setVlBcPis(it.getJCAN11().divide(new BigDecimal("100"))); //TODO: [MAPEAMENTO] CAMPO JCBRTXB N�O EXISTE NA TABELA
		pis.setAliquotaPis(it.getJCVT10().divide(new BigDecimal("100000"))); //TODO: [MAPEAMENTO] CAMPO JCBRTXR N�O EXISTE NA TABELA
		pis.setVlPis(it.getJCAN10().divide(new BigDecimal("100"))); //TODO: [MAPEAMENTO] CAMPO JCBRTXA N�O EXISTE NA TABELA 
		return pis;
	}	

	

}
