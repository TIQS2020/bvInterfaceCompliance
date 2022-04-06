package br.com.bv.nfe.vo.nfMercantil;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliance.nfe.jde.domain.F55IJC70;
import br.com.compliance.nfe.jde.domain.F55IJC71;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpImpostos;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpItens;

public class TpItensVO {	

	public static TpItens montaItem(F55IJC71 it, F55IJC70 header, int i) throws Exception {
		TpItens item = new TpItens();
				
		item.setNroItem(new NonNegativeInteger(String.valueOf(i)));
		item.setCodItem(it.getJCLITM());
		item.setDescrItem(it.getJCDSC1());	
		if(it.getJCURRF() != null && !it.getJCURRF().equalsIgnoreCase("")){
			item.setCEan(it.getJCURRF());
			item.setCEanTrib(it.getJCURRF());
		}		
		item.setCodNcm(it.getJCBCLF().replace(".", "").trim());
		item.setGeneroNcm(it.getJCBCLF().substring(0, 2));	
		if(it.getJCBRNOP() != null && !it.getJCBRNOP().equalsIgnoreCase("")){
			item.setCfop(new NonNegativeInteger(it.getJCBRNOP()));
		}		
		item.setUnidCom(it.getJCUOM());
		item.setQtdeComerc(it.getJCUORG().divide(new BigDecimal("100")));
		item.setVlUnitComerc(it.getJCUPRC().divide(new BigDecimal("10000")));
		item.setVlItemBruto(it.getJCAEXP().divide(new BigDecimal("100")));		
		item.setUnidTrib(it.getJCUOM());
		item.setQtdeTribs(it.getJCUORG().divide(new BigDecimal("100")));
		item.setVlUnitTrib(it.getJCUPRC().divide(new BigDecimal("10000")));
		item.setVlFrete(it.getJCBFRT().divide(new BigDecimal("100")));
		item.setVlSeguro(it.getJCBSEG().divide(new BigDecimal("100")));
		item.setVlOutro(it.getJCBDFN().divide(new BigDecimal("100")));		
		item.setDmOrigProd(new BigInteger(it.getJCBORI()));		
		item.setDmIndTot(new NonNegativeInteger("1")); 
		item.setVlDesc(it.getJCBDES().divide(new BigDecimal("100")));
		//item.setDmMotDesIcms(new NonNegativeInteger("9"));		
		item.setCodPart(header.getJCAN8().toString());
		item.setDmIndRecComEnergiaEletrica(new NonNegativeInteger("0"));
		if(it.getJCBRNOP() != null && !it.getJCBRNOP().equalsIgnoreCase("")){
			item.setCodigoNaturezaOperacao(it.getJCBRNOP()); 
		}		
		item.setCodEnqIpi(it.getJCAA05());
			
		List<TpImpostos> impostoList = new ArrayList<TpImpostos>();				
		
		//ICMS
		//if(it.getJCBICM().compareTo(BigDecimal.ZERO) != 0) {
			impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("1"), new NonNegativeInteger("0"), it.getJCBSTT(), "", "", 
					it.getJCBBCL(), it.getJCTXR1().divide(new BigDecimal("1000")), it.getJCBICM(), BigDecimal.ZERO, BigDecimal.ZERO, it.getJCUORG().divide(new BigDecimal("100")), BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO
	                ,BigDecimal.ZERO, BigDecimal.ZERO, ""));
		//}		
		
		//ICMS-ST
		if(it.getJCBVIS().compareTo(BigDecimal.ZERO) != 0) {
			impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("2"), new NonNegativeInteger("0"), it.getJCBSTT(), "", "", 
					it.getJCBBIS(), BigDecimal.ZERO, it.getJCBVIS(), BigDecimal.ZERO, BigDecimal.ZERO, it.getJCUORG().divide(new BigDecimal("100")), BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO
					,BigDecimal.ZERO, BigDecimal.ZERO, ""));
		}		
		
		//IPI
		//if(it.getJCBIPI().compareTo(BigDecimal.ZERO) != 0) {
			impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("3"), new NonNegativeInteger("0"), it.getJCURCD(), "", "", 
					it.getJCBBTP(), it.getJCTXR2().divide(new BigDecimal("1000")), it.getJCBIPI(), BigDecimal.ZERO, BigDecimal.ZERO, it.getJCBBTP().compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : it.getJCUORG().divide(new BigDecimal("100")), 
					BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, 
					BigDecimal.ZERO, BigDecimal.ZERO, ""));
		//}
		
		
		
		//PIS
		impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("4"), new NonNegativeInteger("0"), it.getJCURC1(), "", "00", 
				it.getJCAN03(), it.getJCVT01().divide(new BigDecimal("100000")), it.getJCAN01(), BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO,
				BigDecimal.ZERO, BigDecimal.ZERO,""));
		
		//COFINS 
		impostoList.add(TpImpostoVO.montaImposto(new NonNegativeInteger("5"), new NonNegativeInteger("0"), it.getJCURC2(), "", "00", 
				it.getJCAN03(), it.getJCVT02().divide(new BigDecimal("100000")), it.getJCAN02(), BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO,
				BigDecimal.ZERO, BigDecimal.ZERO,""));	
		
		
		
		item.setImpostos(Arrays.copyOf(impostoList.toArray(), impostoList.toArray().length, TpImpostos[].class));
		
		if(!"".equalsIgnoreCase(header.getJCEV07()) && "0".equalsIgnoreCase(header.getJCEV07()) ){
			item.setCodCta("11300");	
		}else{
			item.setCodCta("41100");
		}
	
			
		return item;
	}

}
