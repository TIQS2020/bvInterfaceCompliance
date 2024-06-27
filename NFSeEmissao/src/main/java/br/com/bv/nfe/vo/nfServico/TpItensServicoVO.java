package br.com.bv.nfe.vo.nfServico;

import java.math.BigInteger;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliance.nfe.jde.domain.F55IJC81;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpItens;

public class TpItensServicoVO {

	public static TpItens montaItem(F55IJC81 it) throws Exception {
		TpItens item = new TpItens();
		
		item.setNroItem(new NonNegativeInteger(it.getJCUKID().toString()));
		item.setCodItemServ(it.getJCLITM());
		item.setDescricao(it.getJCDSC1() + it.getJCDSC2());
		item.setCfop(new NonNegativeInteger(it.getJCBRNOP().toString()));
		item.setCnae(it.getJCAA10());
		System.out.println("BCLF: " + it.getJCBCLF().replace(".", ""));
		item.setCdListaServ(new BigInteger(it.getJCBCLF().replace(".", "")));
		//item.setCodTribMunicipio(it.getJCB76SFCT().replace(".", ""));		
		item.setCodTribMunicipio(it.getJCB76SFCT());
		item.setDmIndCprb(new BigInteger("0"));
		item.setDmLocalExecServ(new NonNegativeInteger(it.getJCLCNF()));
		item.setCidadeIbge(it.getJCCITY1());
		item.setCodCta(it.getJCADDLCMT());
		item.setCodCentroCusto(it.getJCC9MCU());
		//item.setCdTpServReinf(it.getJCG70CC03());
		item.setDmIndCprb(new BigInteger(it.getJCEV02()));
		return item;
	}

}
