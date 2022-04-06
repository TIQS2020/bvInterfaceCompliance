package br.com.bv.nfe.vo.nfServico;

import java.math.BigDecimal;

import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpValores;

public class TpValoresVO {

	public static TpValores montaValores(BigDecimal vlServico)
			throws Exception {

		TpValores valores = new TpValores();
		valores.setVlServico(vlServico.divide(new BigDecimal(100)));
		return valores;

	}

}
