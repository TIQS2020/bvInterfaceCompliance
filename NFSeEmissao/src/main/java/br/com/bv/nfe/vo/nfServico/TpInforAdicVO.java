package br.com.bv.nfe.vo.nfServico;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliance.nfe.jde.domain.F55IJC81;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpInforAdic;

public class TpInforAdicVO {

	public static TpInforAdic montaInforAdic(F55IJC81 f55ijc81) throws Exception {
		TpInforAdic infoA = new TpInforAdic();
		infoA.setConteudo(f55ijc81.getJCAGEN());
		//infoA.setOrigemProcesso(new BigInteger("4"));
		infoA.setTipo(new NonNegativeInteger(f55ijc81.getJC54RBDPW()));
		return infoA;
	}

}
