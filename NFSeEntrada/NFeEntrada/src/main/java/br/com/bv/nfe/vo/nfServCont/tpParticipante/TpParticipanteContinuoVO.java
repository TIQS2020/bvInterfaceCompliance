package br.com.bv.nfe.vo.nfServCont.tpParticipante;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.vo.EmissaoVO;
import br.com.compliance.nfe.jde.domain.F55IJC74;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpEndereco;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpParticipante;

public class TpParticipanteContinuoVO {
	
	private static final Logger log = LogManager.getLogger(TpParticipanteContinuoVO.class.getClass());
	
	public static List<TpParticipante> montaParticipantes(EmissaoVO e) throws Exception{
		// TODO Auto-generated method stub
		
		log.info("## Montando Participante ##");
		
		List<TpParticipante> participanteList = new ArrayList<TpParticipante>();
		for(F55IJC74 part : e.getParticipanteNFeList()){
			
			log.info("+ Código: " + part.getJCAN8().toString());
			log.info("+ Nome: " + part.getJCDQ01());
			
			TpParticipante p = new TpParticipante();
			//p.setCodPart(part.getJCAN8().toString());		
			//p.setDmTipoPessoa(new BigInteger("1")); //TODO: new BigInteger(part.getJCEV02())
			//p.setDmTipoPessoa(new BigInteger(part.getJCEV02()));
			p.setNome(part.getJCDQ01());
			
			TpEndereco end = TpEnderecoContinuoVO.montaEndereco(part, e.getHeader());
			
			p.setEndereco(end);
			
			/*
			TpContato c = ContatoVO.montaContato(part);
			p.setContato(c);
			
			Documentos d = DocumentosVO.montaDocumentos(part);
			p.setDocumentos(d);
			*/
			participanteList.add(p);
		}
		return participanteList;
	}
	
	public static TpParticipante montaParticipante(F55IJC74 part, EmissaoVO e) throws Exception{
		TpParticipante p = new TpParticipante();
		
		p.setNome(part.getJCDQ01());
		
		TpEndereco end = TpEnderecoContinuoVO.montaEndereco(part, e.getHeader());
		
		p.setEndereco(end);
		
		return p;
	}

}
