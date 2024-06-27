package br.com.bv.nfe.vo.nfServico;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC81;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpImpostos;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpItens;

public class TpItensVO {

	public static TpItens montaItem(F55IJC81 f, F55IJC80 header, boolean montaDescricao, int i, String cnae84) throws Exception {
		TpItens item = new TpItens();

		item.setNroItem(new NonNegativeInteger(String.valueOf(i)));
		item.setNroItem(new NonNegativeInteger(f.getJCUKID().toString()));
		item.setCodItemServ(f.getJCLITM());
		if(montaDescricao) {
			//item.setDescricao(f.getJCAGEN());
			item.setDescricao(f.getJCNOTTE().trim());
		}else {
			//item.setDescricao(f.getJCDSC1() + f.getJCDSC2());
			item.setDescricao(f.getJCD200());
		}
		
		item.setCfop(new NonNegativeInteger(f.getJCBRNOP().toString()));
		//item.setCnae(f.getJCAA10());
		item.setCnae(cnae84);
		System.out.println("BCLF: " + f.getJCBCLF().replace(".", ""));
		item.setCdListaServ(new BigInteger(f.getJCBCLF().replace(".", "")));
		//if(ibgeVO.getIbgeList().contains(f.getJCCITY1().trim())) {
		item.setCodTribMunicipio(f.getJCB76SFCT().replace(".", ""));
		//item.setCodTribMunicipio(f.getJCB76SFCT());
//		}else {
//			item.setCodTribMunicipio(f.getJCB76SFCT());
//		}
		item.setDmIndCprb(new BigInteger("0"));
		item.setDmLocalExecServ(new NonNegativeInteger(f.getJCLCNF()));
		item.setCidadeIbge(f.getJCCITY1());
		item.setCodCta(f.getJCADDLCMT());
		item.setCodCentroCusto(f.getJCC9MCU());
		//item.setCdTpServReinf(f.getJCG70CC03());

		if (f.getJCEV02() == null)
			item.setDmIndCprb(BigInteger.ZERO);
		else
			item.setDmIndCprb(new BigInteger(f.getJCEV02()));

		List<TpImpostos> impostoList = new ArrayList<TpImpostos>();		
		
		// ISS RETIDO		
		if(f.getJCBISS().compareTo(BigDecimal.ZERO) == 1){
			impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("6"), new NonNegativeInteger("1"), "",
					f.getJCBBCS().compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : f.getJCBBCS(),
					f.getJCTXR3(), f.getJCBISS(), "0", null));
		}
		// ISS IMPOSTO			
		if(f.getJCAN08().compareTo(BigDecimal.ZERO) == 1){
			impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("6"), new NonNegativeInteger("0"), "",
					f.getJCAN09().compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : f.getJCAN09(),
					f.getJCVT08(), f.getJCAN08(), "0", null));
		}
		
		// PIS RETIDO
		if(f.getJCAN01().compareTo(BigDecimal.ZERO) == 1) {
			impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("4"), new NonNegativeInteger("1"), "",
					f.getJCAN03().compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : f.getJCAN03(),
					f.getJCVT01(), f.getJCAN01(), "0", null));
		}
		// PIS IMPOSTO
		if(f.getJCAN10().compareTo(BigDecimal.ZERO) == 1){
			impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("4"), new NonNegativeInteger("0"), f.getJCURC1(),
					f.getJCAN11().compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : f.getJCAN11(),
					f.getJCVT10(), f.getJCAN10(), "0", null));
		}
		
		// COFINS RETIDO
		if(f.getJCAN02().compareTo(BigDecimal.ZERO) == 1) {
			impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("5"), new NonNegativeInteger("1"), "",
					f.getJCAN03().compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : f.getJCAN03(),
					f.getJCVT02(), f.getJCAN02(), "0", null));
		}
		// COFINS IMPOSTO		
		if(f.getJCAN12().compareTo(BigDecimal.ZERO) == 1){
			impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("5"), new NonNegativeInteger("0"), f.getJCURC2(),
					f.getJCAN13().compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : f.getJCAN13(),
					f.getJCVT12(), f.getJCAN12(), "0", null));
		}
		
		// INSS
		if(f.getJCAN04().compareTo(BigDecimal.ZERO) == 1) {
			impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("13"), new NonNegativeInteger("1"), "",
					f.getJCAN05().compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : f.getJCAN05(),
					f.getJCVT04(), f.getJCAN04(), "0", f.getJCURRF()));
		}
		
		// CSLL
		if(f.getJCAN06().compareTo(BigDecimal.ZERO) == 1) {
			impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("11"), new NonNegativeInteger("1"), "",
					f.getJCAN07().compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : f.getJCAN07(),
					f.getJCVT06(), f.getJCAN06(), "0", null));
		}
		
		// IRRF
		if(f.getJCBIRT().compareTo(BigDecimal.ZERO) == 1) {
			impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("12"), new NonNegativeInteger("1"), "",
					f.getJCBBCR().compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : f.getJCBBCR(),
					f.getJCTXR4(), f.getJCBIRT(), "0", null));
		}		

		item.setImpostos(Arrays.copyOf(impostoList.toArray(), impostoList.toArray().length, TpImpostos[].class));
		
		item.setValores(TpValoresVO.montaValores(f.getJCAEXP()));
		item.setDmTribMunPrest(new NonNegativeInteger(f.getJCEV01()));

		return item;
	}

}
