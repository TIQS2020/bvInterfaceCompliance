package br.com.bv.nfe.vo.nfServico;

import java.math.BigDecimal;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliance.nfe.jde.domain.F55IJC85;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAdicaoDecImpor;

public class TpAdicaoDecImporVO {
	
	public static TpAdicaoDecImpor montaTpAdicaoDecImpor(F55IJC85 ip) throws Exception{
		
		int index = ip.getJCAA16().indexOf(",");
		
		String JCAA16SubStr = ip.getJCAA16().substring(0, index);
		
		TpAdicaoDecImpor adicaoDecImpor = new TpAdicaoDecImpor();
		adicaoDecImpor.setNroAdicao(new NonNegativeInteger(ip.getJCSBSQ().toString()));
		adicaoDecImpor.setNroSeqAdic(new NonNegativeInteger(JCAA16SubStr));
		adicaoDecImpor.setCodPartFabricante(ip.getJCURAB().toString());
		adicaoDecImpor.setNumAcdraw(ip.getJCAA11());
		adicaoDecImpor.setVlDescDi(ip.getJCBDES().divide(new BigDecimal("100")));
		
		return adicaoDecImpor;
		
	}

}
