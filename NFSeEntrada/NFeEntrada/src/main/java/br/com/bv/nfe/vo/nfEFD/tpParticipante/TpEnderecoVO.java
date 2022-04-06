package br.com.bv.nfe.vo.nfEFD.tpParticipante;

import java.math.BigInteger;

import br.com.compliance.nfe.jde.domain.F55IJC70;
import br.com.compliance.nfe.jde.domain.F55IJC74;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpEndereco;

public class TpEnderecoVO {

	public static TpEndereco montaEndereco(F55IJC74 part, F55IJC70 header) throws Exception{
		TpEndereco end = new TpEndereco();		
		end.setBairro(part.getJCPP02());		
		end.setCidade(part.getJCPP01());
		end.setUf(header.getJCSHST());
		
		if(part.getJCAA08() != null && !"".equalsIgnoreCase(part.getJCAA08())){
			end.setCep(new BigInteger(part.getJCAA08()));
		}else{
			end.setCep(BigInteger.ZERO);
		}
		
		end.setCodSiscomexPais(new BigInteger(part.getJCKA01().toString()));
		end.setComplemento(part.getJCTXLN());
		//end.setCxPostal(part.getJCKI08());
		end.setIbgeCidade(part.getJCIDNO().toString());
		end.setLogradouro(part.getJCQ60());
		end.setNumero(part.getJCPDSC());
		end.setPais(part.getJCWTXT());
		
		return end;	
		
	}	

}
