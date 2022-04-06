package br.com.bv.nfe.vo.participante;

import java.math.BigInteger;

import br.com.compliance.nfe.jde.domain.F55IJC74;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Endereco;

public class EnderecoVO {

	public static Endereco montaEndereco(F55IJC74 part) throws Exception{
		Endereco end = new Endereco();		
		end.setBairro(part.getJCPP02());		
		
		if(part.getJCAA08() != null && !"".equalsIgnoreCase(part.getJCAA08())){
			end.setCep(new BigInteger(part.getJCAA08()));
		}else{
			end.setCep(BigInteger.ZERO);
		}
		
		end.setCodSiscomexPais(new BigInteger(part.getJCKA01().toString()));
		end.setComplemento(part.getJCTXLN());
		end.setCxPostal(part.getJCKI08());
		end.setIbgeCidade(part.getJCIDNO().toString());
		end.setLogradouro(part.getJCQ60());
		end.setNumero(part.getJCPDSC());
		
		return end;	
		
	}


	

}
