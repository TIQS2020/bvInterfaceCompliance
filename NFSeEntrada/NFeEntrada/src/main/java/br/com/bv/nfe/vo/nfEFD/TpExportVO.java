package br.com.bv.nfe.vo.nfEFD;

import java.math.BigInteger;

import br.com.compliance.nfe.jde.domain.F55IJC88;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpExport;

public class TpExportVO {
	
	public static TpExport montaItemExport(F55IJC88 exp ) throws Exception{
		TpExport export = new TpExport();
		export.setNumAcdraw(exp.getJCAA11());
		export.setNumRegExport(new BigInteger(exp.getJCAA12()));
		export.setChaveAcessoNfeExport(exp.getJCBBRCD());
		export.setQtdeExport(exp.getJCAEXP());
		
		return export;
	}

}
