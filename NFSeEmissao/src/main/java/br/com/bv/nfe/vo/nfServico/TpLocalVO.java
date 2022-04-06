package br.com.bv.nfe.vo.nfServico;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC84;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpLocal;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj;

public class TpLocalVO {
	
	public static TpLocal montaLocal(F55IJC80 header, F55IJC84 e) throws Exception{
		TpLocal local = new TpLocal();
		local.setDmTipoLocal(new NonNegativeInteger("1"));
		local.setDmIndCarga(new NonNegativeInteger("0"));
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
		
		local.setBairro(e.getJCPP02());				
		local.setCidade(e.getJCPP01());
		local.setCidadeIbge(e.getJCIDNO().toString());		
		local.setCompl(e.getJCTXLN());					
		local.setCpfCnpj(c);		
		local.setIe(e.getJCCMT1());		
		local.setLograd(e.getJCQ60());		
		local.setNro(e.getJCPDSC());		
		//local.setUf(e.getJCAA02());
		local.setUf(e.getJCCH3());
		
		
		return local;
	}

}
