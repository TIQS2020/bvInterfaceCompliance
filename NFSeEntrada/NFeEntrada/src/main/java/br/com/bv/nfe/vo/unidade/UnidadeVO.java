package br.com.bv.nfe.vo.unidade;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.vo.EmissaoVO;
import br.com.compliance.nfe.jde.domain.F55IJC71;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.unidade.Unidade;

public class UnidadeVO {
	
	private static final Logger log = LogManager.getLogger(UnidadeVO.class.getClass());

	public static List<Unidade> montaUnidade(EmissaoVO e) throws Exception{
		
		log.info("## Montando Unidade ##");
		
		List<Unidade> listUn = new ArrayList<Unidade>();
		for(F55IJC71 f : e.getDetalheNFeList()){
			
			log.info("+ Sigla: " + f.getJCUOM());		
			
			Unidade un = new Unidade();
			un.setDescricao(f.getJCDL01());
			un.setSigla(f.getJCUOM());
			listUn.add(un);
		}
		return listUn;
	}
}
