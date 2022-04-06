package br.com.bv.nfe.vo.nfServCont.tpParticipante;

import br.com.compliance.nfe.jde.domain.F55IJC74;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Documentos;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpRgIE;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj;

public class TpDocumentosContinuoVO {

	public static Documentos montaDocumentos(F55IJC74 part) throws Exception{
		Documentos doc = new Documentos();
				
		TpCpfCnpj c = new TpCpfCnpj();
		if("1".equalsIgnoreCase(part.getJCEV02())){
			c.setCnpj(part.getJCKY1());
		}else{
			c.setCpf(part.getJCKY1());
		}		
		doc.setCpfCnpj(c);
		TpRgIE ie = new TpRgIE();
		if(part.getJCCMT1() != null && !"".equalsIgnoreCase(part.getJCCMT1())){
			ie.setIe(part.getJCCMT1());
		}		
		doc.setRgIE(ie);
		doc.setIdEstrangeiro(part.getJCAA20());
		doc.setInscricaoMunicipal(part.getJCCMT2());
		doc.setInscricaoProdutor(part.getJCEV03());
		
		return doc;
	}

}
