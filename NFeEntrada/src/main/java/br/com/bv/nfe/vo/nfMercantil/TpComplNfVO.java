package br.com.bv.nfe.vo.nfMercantil;

import java.math.BigInteger;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliance.nfe.jde.domain.F55IJC70;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpComplNf;

public class TpComplNfVO {

	public static TpComplNf montaComplNf(F55IJC70 e) throws Exception{
		TpComplNf complNf = new TpComplNf();
		complNf.setViasDanfeCustom(new BigInteger(e.getJCA201()));
		complNf.setSistOrig("JDE");
		complNf.setIdNfErp(new NonNegativeInteger(e.getJCBNNF().toString()));
		
		if(!"".equalsIgnoreCase(e.getJCEV07()) && "0".equalsIgnoreCase(e.getJCEV07()) ){
			complNf.setCodigoPlanoConta("11300");			
		}else{
			complNf.setCodigoPlanoConta("41100");
		}
		
		return complNf;
	}

}
