package br.com.bv.nfe.vo.nfMercantil;

import java.math.BigDecimal;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosIcms;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosIcmsSt;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosOutros;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpImpostos;

public class TpImpostoVO {
	
	public static TpImpostos montaImposto(NonNegativeInteger codImposto, NonNegativeInteger tipo, String codSt, String tipoRetencaoImposto,
			String naturezaReceitaPisCofins, BigDecimal vlBaseCalc, BigDecimal aliquota, BigDecimal vlImpTrib, BigDecimal percReduc,
			BigDecimal percAdic, BigDecimal qtdeBaseCalcProd, BigDecimal vlAliqProd, BigDecimal percBaseCalcOperProd, BigDecimal vlImpNaoDest,
			BigDecimal vlBaseStRet, BigDecimal vlIcmsStRet, String ufSt) throws Exception{
		
		TpImpostos imposto = new TpImpostos();
		
		/*
		TpDadosIcmsSt dadosIcmsSt = null;
		
		if(vlBaseStRet.compareTo(BigDecimal.ZERO) == 0 &&
				vlIcmsStRet.compareTo(BigDecimal.ZERO) == 0 &&
				ufSt.equals("")){
			
			dadosIcmsSt = new TpDadosIcmsSt("", new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"));
			
		}else{
			dadosIcmsSt = new TpDadosIcmsSt(ufSt, vlBaseStRet, vlIcmsStRet, new BigDecimal("0"), new BigDecimal("0"));
		}	
		
		*/
		TpDadosIcmsSt dadosIcmsSt = new TpDadosIcmsSt(ufSt, vlBaseStRet, vlIcmsStRet, new BigDecimal("0"), new BigDecimal("0"));						
		TpDadosIcms dadosIcms = new TpDadosIcms(null, new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"));		
		TpDadosOutros dadosOutros = new TpDadosOutros(new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"));
		
		/*
		 * TODO: VERIFICAR REGRA PARA CRIA��O DA TAG ICMSDEST
		TpImpItemNfIcmsDest icmsDest = new TpImpItemNfIcmsDest(new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"), new BigDecimal("0"));
		imposto.setImpItemIcmsDest(icmsDest);
		*/
		
		imposto.setCodImposto(codImposto); 
		imposto.setTipo(new NonNegativeInteger("0"));		
		imposto.setCodSt(codSt);			
		imposto.setTipoRetencaoImposto(tipoRetencaoImposto);
		imposto.setNaturezaReceitaPisCofins(naturezaReceitaPisCofins); 
		imposto.setVlBaseCalc(vlBaseCalc.divide(new BigDecimal(100))); 
		imposto.setAliquota(aliquota); 
		imposto.setVlImpTrib(vlImpTrib.divide(new BigDecimal("100"))); 
		imposto.setPercReduc(percReduc.divide(new BigDecimal("100"))); 
		imposto.setPercAdic(percAdic.divide(new BigDecimal("100"))); 
		imposto.setQtdeBaseCalcProd(qtdeBaseCalcProd.divide(new BigDecimal("1000"))); 
		imposto.setVlAliqProd(vlAliqProd.divide(new BigDecimal("100"))); 
		imposto.setPercBaseCalcOperProd(percBaseCalcOperProd.divide(new BigDecimal("100"))); 
		imposto.setVlImpNaoDest(vlImpNaoDest.divide(new BigDecimal("100"))); 					
		imposto.setDadosIcmsSt(dadosIcmsSt);		
		imposto.setDadosOutros(dadosOutros);
		imposto.setDadosIcms(dadosIcms);
		
		
		return imposto;
		
	}

}
