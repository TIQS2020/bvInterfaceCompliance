package br.com.bv.nfe.vo.nfServico;

import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliance.nfe.jde.domain.F55IJC70;
import br.com.compliance.nfe.jde.domain.F55IJC74;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDestEmail;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDestinatario;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj;

public class TpDestinatarioVO {

	public static TpDestinatario montaDestinatario(F55IJC70 header, F55IJC74 e) throws Exception{
		TpDestinatario destinatario = new TpDestinatario();
		TpCpfCnpj c = new TpCpfCnpj();
		if("1".equalsIgnoreCase(e.getJCEV02())){
			c.setCnpj(e.getJCKY1());
		}
		if("0".equalsIgnoreCase(e.getJCEV02())){
			c.setCpf(e.getJCKY1());
		}
		if("2".equalsIgnoreCase(e.getJCEV02())){
			c.setCnpj(" ");
		}				
		destinatario.setSuframa(e.getJCAA09());
		destinatario.setBairro(e.getJCPP02());
		if(e.getJCAA08() != null && !"".equalsIgnoreCase(e.getJCAA08())){
			destinatario.setCep(new BigInteger(e.getJCAA08()));
		}else{
			destinatario.setCep(BigInteger.ZERO);
		}		
		destinatario.setCidade(e.getJCPP01());
		destinatario.setCidadeIbge(e.getJCIDNO().toString());
		destinatario.setCodSiscomexPais(new BigInteger(e.getJCKA01().toString()));
		destinatario.setCompl(e.getJCTXLN());					
		destinatario.setCpfCnpj(c);					
		destinatario.setFone(e.getJCA901());
		destinatario.setIe(e.getJCCMT1());					
		destinatario.setIm(e.getJCCMT2());
		destinatario.setLograd(e.getJCQ60());
		destinatario.setNome(e.getJCDQ01());
		destinatario.setNro(e.getJCPDSC());
		destinatario.setPais(e.getJCWTXT());
		destinatario.setUf(header.getJCSHST());	
		
		if(e.getJCXDEC().toString() != null && e.getJCXDEC() > 0){
			destinatario.setDmIndIeDest(new NonNegativeInteger(e.getJCXDEC().toString()));
		}	  
		
		if(e.getJCEMAL() != null){
			String[] emails = e.getJCEMAL().split(";");
			List<TpDestEmail> tpDestEmailList = new ArrayList<TpDestEmail>(); 
			for(String s : emails){
				TpDestEmail tpDestEmail = new TpDestEmail();
				tpDestEmail.setEmail(s);
				if(e.getJCEV05() != null && !"".equals(e.getJCEV05())){
					tpDestEmail.setDmTipoAnexo(new NonNegativeInteger(e.getJCEV05()));
				}				
				
				tpDestEmailList.add(tpDestEmail);
			}
			
			/*Inclusão de e-mail no Envio de NF-e*/
			Scanner x = new Scanner(new File("c:/Java/resources/emails.txt"));
	        x.useDelimiter(";");
	        
	        while(x.hasNext()){	 
	        	TpDestEmail tpDestEmailArquivo = new TpDestEmail();
	        	tpDestEmailArquivo.setEmail(x.next());  
	        	tpDestEmailList.add(tpDestEmailArquivo);
	        }
	        x.close();         
			
			destinatario.setDestEmail(Arrays.copyOf(tpDestEmailList.toArray(), tpDestEmailList.toArray().length, TpDestEmail[].class));
			
		}
		
		return destinatario;
	}

}
