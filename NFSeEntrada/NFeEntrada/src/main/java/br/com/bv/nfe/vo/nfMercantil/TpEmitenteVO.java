package br.com.bv.nfe.vo.nfMercantil;

import java.math.BigInteger;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliance.nfe.jde.domain.F55IJC70;
import br.com.compliance.nfe.jde.domain.F55IJC74;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpEmitente;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj;

public class TpEmitenteVO {

	public static TpEmitente montaEmitente(F55IJC70 header, F55IJC74 e) throws Exception{
		TpCpfCnpj c = new TpCpfCnpj();
		c.setCnpj(e.getJCKY1());
		
		TpEmitente emitente = new TpEmitente();
		emitente.setBairro(e.getJCPP02());
		emitente.setCep(new BigInteger(e.getJCAA08()));
		emitente.setCidade(e.getJCPP01());
		emitente.setCidadeIbge(e.getJCIDNO().toString());
		emitente.setCodSiscomexPais(new BigInteger(e.getJCKA01().toString()));
		emitente.setCompl(e.getJCTXLN());
		emitente.setCpfCnpj(c);
		emitente.setFantasia(e.getJCDQ02());
		emitente.setFone(e.getJCAA04()+e.getJCA901());
		if(e.getJCCMT1() != null && !"".equals(e.getJCCMT1())){
			emitente.setIe(e.getJCCMT1());
		}
		
		//emitente.setIeSt(e.getJCCH2());
		emitente.setIm(e.getJCCMT2());
		emitente.setLograd(e.getJCQ60());
		emitente.setNome(e.getJCDQ01());
		emitente.setNro(e.getJCPDSC());
		emitente.setPais(e.getJCWTXT());
		emitente.setUf(header.getJCADDS());
		emitente.setDmRegTribNf(new NonNegativeInteger(e.getJCCH2()));					
		emitente.setCnae(e.getJCAA10());
		return emitente;
	}

}
