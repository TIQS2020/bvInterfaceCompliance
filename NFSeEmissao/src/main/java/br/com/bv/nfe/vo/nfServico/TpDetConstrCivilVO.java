package br.com.bv.nfe.vo.nfServico;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliance.nfe.jde.domain.F55IJC81;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDetConstrCivil;

public class TpDetConstrCivilVO {

	public static TpDetConstrCivil montaTpDetConstrCivil(F55IJC81 p) throws Exception {

		TpDetConstrCivil detConstrCivil = new TpDetConstrCivil();
		if(!"".equalsIgnoreCase(p.getJCEV16())) {
			detConstrCivil.setDmIndObra(new NonNegativeInteger(p.getJCEV16()));
		}		

		return detConstrCivil;

	}

}
