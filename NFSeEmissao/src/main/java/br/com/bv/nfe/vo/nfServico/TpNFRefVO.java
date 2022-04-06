package br.com.bv.nfe.vo.nfServico;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC86;
import br.com.compliance.nfe.util.DateUtil;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpNFRef;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj;

public class TpNFRefVO {

	public static TpNFRef montaNfRef(F55IJC86 nfr, F55IJC80 header) throws Exception{
		// TODO Auto-generated method stub
		TpNFRef n = new TpNFRef();		
		n.setCodPart(header.getJCAN8().toString());		
		TpCpfCnpj cpfCnpj = new TpCpfCnpj();
		cpfCnpj.setCnpj(nfr.getJCAA15());	
		DateUtil dateUtil = new DateUtil();			
		n.setIbgeEstadoEmit(nfr.getJCAA02());	
		n.setNroChaveNfe(nfr.getJCBBRCD());
		String data = nfr.getJCSFLB() + "-" + nfr.getJCABO1() + "-" + nfr.getJCKA01();
		
		if("".equalsIgnoreCase(nfr.getJCBBRCD())){
			n.setDtEmiss(dateUtil.getDateFormated(data));				
			n.setCodMod(nfr.getJCURCD());
			n.setNroNf(new NonNegativeInteger(nfr.getJCNNSF().toString()));
			n.setSerie(nfr.getJCAA05().substring(1));
		}		
		
		if(nfr.getJCURC1() != null && !"".equalsIgnoreCase(nfr.getJCURC1())){
			n.setDmIndEmit(new NonNegativeInteger(nfr.getJCURC1()));			
		}else{
			n.setDmIndEmit(null);
		}
		
		if(nfr.getJCURC2() != null && !"".equalsIgnoreCase(nfr.getJCURC2())){
			n.setDmIndOper(new NonNegativeInteger(nfr.getJCURC2()));
		}else{
			n.setDmIndOper(null);
		}
		
		n.setIe(nfr.getJCAA14());
		n.setCpfCnpj(cpfCnpj);
		
				
		return n;
	}

}
