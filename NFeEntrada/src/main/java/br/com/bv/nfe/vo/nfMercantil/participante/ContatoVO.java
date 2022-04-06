package br.com.bv.nfe.vo.nfMercantil.participante;

import br.com.compliance.nfe.jde.domain.F55IJC74;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Contato;

public class ContatoVO {

	public static Contato montaContato(F55IJC74 part) throws Exception{
		Contato c = new Contato();
		c.setFax(part.getJCAA04()+part.getJCA901());
		c.setTelefone(part.getJCAA04()+part.getJCA901());
		
		return c;
	}

}
