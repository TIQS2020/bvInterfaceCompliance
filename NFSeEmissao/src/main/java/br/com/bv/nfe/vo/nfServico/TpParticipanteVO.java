package br.com.bv.nfe.vo.nfServico;

import java.math.BigInteger;

import br.com.compliance.nfe.jde.domain.F55IJC84;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpContato;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDocumentos;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpEndereco;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpParticipante;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj;

public class TpParticipanteVO {

	public static TpParticipante montaTpParticipante(F55IJC84 p, String uf) throws Exception {

		

		TpContato contato = new TpContato(p.getJCAA04()+p.getJCA901(), p.getJCEMAL());

		TpCpfCnpj c = new TpCpfCnpj();
		
		if ("1".equalsIgnoreCase(p.getJCEV02())) {
			c.setCnpj(p.getJCKY1());		
		} else if("2".equalsIgnoreCase(p.getJCEV02())){
			c.setCnpj(p.getJCKY1());
		} else {		
			c.setCpf(p.getJCKY1());
		}
		
		TpParticipante participante = null;
		
		if("1058".equalsIgnoreCase(p.getJCKA01().toString())) {
			TpDocumentos documentos = new TpDocumentos(c, p.getJCCMT1(), p.getJCCMT2(), p.getJCAA09());
			TpEndereco endereco = new TpEndereco(p.getJCQ60(), p.getJCPDSC(), p.getJCTXLN(), p.getJCPP02(), p.getJCPP01(),
					p.getJCCH3(), p.getJCIDNO().toString(), new BigInteger(p.getJCAA08()), new BigInteger(p.getJCKA01().toString()),
					p.getJCWTXT(), ""// idEstrangeiro
			);
			participante = new TpParticipante(p.getJCDQ01(), endereco, contato, documentos);
		}else {
			TpEndereco endereco = new TpEndereco(p.getJCQ60(), p.getJCPDSC(), p.getJCTXLN(), "....", p.getJCPP01(),
					p.getJCCH3(), p.getJCIDNO().toString(), new BigInteger(p.getJCAA08()), new BigInteger(p.getJCKA01().toString()),
					p.getJCWTXT(), ""// idEstrangeiro
			);
			participante = new TpParticipante(p.getJCDQ01(), endereco, contato,null);
		}	


		return participante;

	}

}
