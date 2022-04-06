package br.com.bv.nfe.vo.participante;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.vo.EnvioVO;
import br.com.compliance.nfe.jde.domain.F55IJC84;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Contato;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Documentos;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Endereco;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Participante;

public class ParticipanteVO {
	
	private static final Logger log = LogManager.getLogger(ParticipanteVO.class.getClass());
	
	public static List<Participante> montaParticipantes(EnvioVO e) throws Exception{
		
		log.info("## Montando Participante ##");
		
		List<Participante> participanteList = new ArrayList<Participante>();
		for(F55IJC84 part : e.getParticipanteNFeList()){
			
			log.info("+ Código: " + part.getJCAN8().toString());
			log.info("+ Nome: " + part.getJCDQ01());
			
			Participante p = new Participante();
			p.setCodPart(part.getJCAN8().toString());		
			//p.setDmTipoPessoa(new BigInteger("1")); //TODO: 
			p.setDmTipoPessoa(new BigInteger(part.getJCEV02()));
			p.setNome(part.getJCDQ01());
			
			Endereco end = EnderecoVO.montaEndereco(part, e.getHeader().getJCADDS());
			p.setEndereco(end);
			
			Contato c = ContatoVO.montaContato(part);
			p.setContato(c);
			
			Documentos d = DocumentosVO.montaDocumentos(part);
			p.setDocumentos(d);
			
			participanteList.add(p);
		}
		return participanteList;
	}

}
