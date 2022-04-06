package br.com.bv.nfe.vo.nfEFD.tpParticipante;

import br.com.compliance.nfe.jde.domain.F55IJC74;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpContato;

public class TpContatoVO {

	public static TpContato montaContato(F55IJC74 part) throws Exception{
		TpContato c = new TpContato();
		/*
		c.setFax(part.getJCA901());
		c.setTelefone(part.getJCA901());
		*/
		return c;
	}

}
