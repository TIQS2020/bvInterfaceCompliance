package br.com.bv.nfe.vo.nfEFD;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliance.nfe.jde.domain.F55IJC70;
import br.com.compliance.nfe.jde.domain.F55IJC71;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpImpostos;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpItens;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpValores;

public class TpItensVO {	

	public static TpItens montaItem(F55IJC71 it, F55IJC70 header, int i) throws Exception {
		TpItens item = new TpItens();
				
		//item.setNroItem(new NonNegativeInteger(String.valueOf(i)));
		item.setNroItem(new NonNegativeInteger(it.getJCUKID().toString()));
		item.setCodItemServ(it.getJCLITM());
		item.setDescricao(it.getJCDSC1() + " " + it.getJCDSC2());
		item.setCfop(new NonNegativeInteger(it.getJCBRNOP()));
			
		/*TODO:[Mapeamento] campos em vermelho*/
		/*
		item.setCnae("");
		item.setCdListaServ(cdListaServ); integer não tem como ser branco como no mapeamento
		item.setCodTribMunicipio(codTribMunicipio); 
		item.setCodBaseCalcCredPc(codBaseCalcCredPc);
		item.setDmIndOrigCred(new NonNegativeInteger("0"));
		item.setDtPgtoPis(dtPgtoPis);
		item.setDtPgtoCofins(dtPgtoCofins);
		item.setDmLocalExecServ(dmLocalExecServ);
		item.setDmTribMunPrest(dmTribMunPrest);
		item.setCidadeIbge(cidadeIbge);
		item.setCodCta(codCta);
		item.setCodCentroCusto(codCentroCusto);
		item.setCdCidadeBeneficFiscal(cdCidadeBeneficFiscal);		
		*/
		item.setDmIndOrigCred(new NonNegativeInteger("0"));		
		item.setDmLocalExecServ(new NonNegativeInteger("0"));
		item.setDmTribMunPrest(new NonNegativeInteger("1"));
		item.setCidadeIbge(it.getJCAA10());
		List<TpImpostos> impostoList = new ArrayList<TpImpostos>();				
		
		/*TODO:[Mapeamento]*/
			
		// PIS RETIDO
		if(it.getJCAN01().compareTo(BigDecimal.ZERO) != 0) {
			if(it.getJCAN01().compareTo(BigDecimal.ZERO) == 1) {
				impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("4"), new NonNegativeInteger("1"), it.getJCURC1(),
						it.getJCAN03().compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : it.getJCAN03(),
								it.getJCVT01(), it.getJCAN01(), "0",it.getJCURAB()));
			}
		}
				
		// PIS IMPOSTO
		if(it.getJCAN10().compareTo(BigDecimal.ZERO) != 0) {
			if(it.getJCAN10().compareTo(BigDecimal.ZERO) == 1){
				impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("4"), new NonNegativeInteger("0"), it.getJCURC1(),
						it.getJCAN11().compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : it.getJCAN11(),
								it.getJCVT10(), it.getJCAN10(), "0",it.getJCURAB()));
			}
		}
		
		
		
		// COFINS RETIDO
		if(it.getJCAN02().compareTo(BigDecimal.ZERO) != 0) {
			if(it.getJCAN02().compareTo(BigDecimal.ZERO) == 1) {
				impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("5"), new NonNegativeInteger("1"), it.getJCURC2(),
						it.getJCAN03().compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : it.getJCAN03(),
								it.getJCVT02(), it.getJCAN02(), "0",it.getJCURAB()));
			}
		}
		
		// COFINS IMPOSTO
		if(it.getJCAN12().compareTo(BigDecimal.ZERO) != 0) {
			if(it.getJCAN12().compareTo(BigDecimal.ZERO) == 1){
				impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("5"), new NonNegativeInteger("0"), it.getJCURC2(),
						it.getJCAN13().compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : it.getJCAN13(),
								it.getJCVT12(), it.getJCAN12(), "0", it.getJCURAB()));
			}	
		}
			
				
		//ISS
		/*
		impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("6"), new NonNegativeInteger("0"), it.getJCURC2(), BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO,
				BigDecimal.ZERO, new NonNegativeInteger("0"), "", ""));		
		*/
		//INSS	
		if(it.getJCAN04().compareTo(BigDecimal.ZERO) != 0) {
			if(it.getJCAN04().compareTo(BigDecimal.ZERO) == 1) {
				impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("13"), new NonNegativeInteger("1"), "",
						it.getJCAN05().compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : it.getJCAN05(),
						it.getJCVT04(), it.getJCAN04(), "0", it.getJCURAB()));
			}
		}
		
//		if(it.getJCAN06().compareTo(BigDecimal.ZERO) != 0){
//			impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("13"), new NonNegativeInteger("1"), it.getJCB76TSCOF(), 
//					it.getJCVT06(), it.getJCAN07(), it.getJCAN06(),
//					BigDecimal.ZERO, new NonNegativeInteger("0"), it.getJCURAB().toString(), ""));
//									
//		}
		
		
		
		item.setImpostos(Arrays.copyOf(impostoList.toArray(), impostoList.toArray().length, TpImpostos[].class));
		
		TpValores valores = new TpValores();
		//valores.setVlServico(header.getJCBVTN());
		valores.setVlServico(it.getJCAEXP().divide(new BigDecimal(100)));
		
		/*TODO:[Mapeamento]*/
		/*
		valores.getVlDescIncondicionado();
		valores.getVlDescCondicionado();
		valores.getVlDeducao();
		valores.getVlOutraRetencao();			
		*/
		
		item.setValores(valores);
		
		return item;
	}

}
