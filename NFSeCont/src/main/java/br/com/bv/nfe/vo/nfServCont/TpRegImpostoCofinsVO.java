package br.com.bv.nfe.vo.nfServCont;

import java.math.BigDecimal;

import br.com.compliance.nfe.jde.domain.F55IJC71;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoCofins;

public class TpRegImpostoCofinsVO {

	public static TpRegImpostoCofins montaCofins(F55IJC71 it) {
		TpRegImpostoCofins cofins = new TpRegImpostoCofins();
		
		//cofins.setCodStCofins(); TODO: [MAPEAMENTO] CAMPO 76TSCOF NAO EXISTE NA TABELA
		cofins.setVlItem(it.getJCAEXP().divide(new BigDecimal("100")));
		//cofins.setVlBcCofins(); TODO: [MAPEAMENTO] CAMPO JCBRTXB NÃO EXISTE NA TABELA
		//cofins.setAliquotaCofins(); TODO: [MAPEAMENTO] CAMPO JCBRTXR NÃO EXISTE NA TABELA
		//cofins.setVlCofins(); TODO: [MAPEAMENTO] CAMPO JCBRTXA NÃO EXISTE NA TABELA 
		
		return cofins;
	}	

	

}
