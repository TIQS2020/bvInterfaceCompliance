package br.com.bv.nfe.vo.nfServico;

import java.math.BigDecimal;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliance.nfe.jde.domain.F55IJC81;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpNfProcReinf;

public class TpNfProcReinfVO {

	public static TpNfProcReinf montaTpNfProcReinf(F55IJC81 p) throws Exception {

		TpNfProcReinf nfProcReinf = new TpNfProcReinf(new NonNegativeInteger(p.getJCPEID()), p.getJCB76APID(),
				new NonNegativeInteger("0"), p.getJCAPDO(), new BigDecimal(p.getJC74UCR()));

		return nfProcReinf;

	}

}
