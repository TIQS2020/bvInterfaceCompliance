package br.com.bv.nfe.vo.nfServCont;

import java.math.BigDecimal;

import br.com.compliance.nfe.jde.domain.F55IJC71;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoCofins;

public class TpRegImpostoCofinsVO {

	public static TpRegImpostoCofins montaCofins(F55IJC71 it) {
		TpRegImpostoCofins cofins = new TpRegImpostoCofins();
		
		cofins.setCodStCofins(it.getJCURC2());// TODO: [MAPEAMENTO] CAMPO 76TSCOF NAO EXISTE NA TABELA
		cofins.setVlItem(it.getJCAEXP().divide(new BigDecimal("100")));
		cofins.setVlBcCofins(it.getJCAN13().divide(new BigDecimal("100")));// TODO: [MAPEAMENTO] CAMPO JCBRTXB NÃO EXISTE NA TABELA
		cofins.setAliquotaCofins(it.getJCVT12().divide(new BigDecimal("100000"))); //TODO: [MAPEAMENTO] CAMPO JCBRTXR NÃO EXISTE NA TABELA
		cofins.setVlCofins(it.getJCAN12().divide(new BigDecimal("100")));// TODO: [MAPEAMENTO] CAMPO JCBRTXA NÃO EXISTE NA TABELA 
		
		return cofins;
	}	

	

}
