package br.com.bv.nfe.vo.nfEFD;

import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpInforAdic;

public class TpInforAdicVO {

	public static TpInforAdic montaInforAdic(StringBuilder sbInforAdic) throws Exception{
		// TODO Auto-generated method stub
		TpInforAdic infoA = new TpInforAdic();				
		
		/*TODO:[Mapemaneot]*/
		
		/*
		infoA.setTipo(tipo);
		infoA.setCampo("INFO");
		infoA.setConteudo(sbInforAdic.toString());
		infoA.setOrigemProcesso(origemProcesso);
		*/
		
		return infoA;
	}

}
