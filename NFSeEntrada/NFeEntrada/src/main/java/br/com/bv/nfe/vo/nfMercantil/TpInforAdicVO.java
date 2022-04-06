package br.com.bv.nfe.vo.nfMercantil;

import java.math.BigInteger;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpInforAdic;

public class TpInforAdicVO {

	public static TpInforAdic montaInforAdic(StringBuilder sbInforAdic) throws Exception{
		TpInforAdic infoA = new TpInforAdic();				
		infoA.setConteudo(sbInforAdic.toString());
		//infoA.setCampo("INFO");
		infoA.setOrigProc(new BigInteger("4"));
		infoA.setTipo(new NonNegativeInteger("0"));
		return infoA;
	}

}
