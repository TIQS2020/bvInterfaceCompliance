package br.com.bv.nfe.vo.participante;

import br.com.compliance.nfe.jde.domain.F55IJC84;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Contato;

public class ContatoVO {

	public static Contato montaContato(F55IJC84 part) throws Exception{
		Contato c = new Contato();
		c.setTelefone(part.getJCAA04()+part.getJCA901());
		c.setEmail(part.getJCEMAL());
		
		return c;
	}

}
