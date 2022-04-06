package br.com.bv.nfe.vo.naturezaOperacao;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.nfe.vo.EmissaoEFDVO;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.naturezaOperacao.NaturezaOperacao;

public class NaturezaOperacaoVO {
	
	private static final Logger log = LogManager.getLogger(NaturezaOperacaoVO.class.getClass());

	public static List<NaturezaOperacao> montaNatOp(EmissaoEFDVO e) throws Exception{
		
		log.info("## Montando Natureza Operacao ##");
		
		log.info("+ Codigo: " + e.getHeader().getJCAA10());
		log.info("+ Descrição: " + e.getHeader().getJCWTXT());
		
		List<NaturezaOperacao> listNatOp = new ArrayList<NaturezaOperacao>();
		NaturezaOperacao natOpr = new NaturezaOperacao();
		natOpr.setCodigoNaturezaOperacao(e.getHeader().getJCAA10());
		natOpr.setDescricaoNaturezaOperacao(e.getHeader().getJCWTXT());
		listNatOp.add(natOpr);
		
		return listNatOp;
	}

}
