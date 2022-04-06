package br.com.bv.nfe.vo.nfEFD;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC83;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpCobranca;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDuplicatas;

public class TpCobrancaVO {

	public static TpCobranca montaCobranca(F55IJC80 header, List<F55IJC83> vencimentoNFeList) throws Exception{
		
		TpCobranca cobranca = new TpCobranca();
		List<TpDuplicatas> dList = new ArrayList<TpDuplicatas>();
		
		BigDecimal valorLiquido = new BigDecimal("0");	
		
		cobranca.setNroFatura(header.getJCBNNF().toString() + header.getJCBSER());
		cobranca.setDmIndEmit(new NonNegativeInteger(header.getJCEV02().toString()));
		cobranca.setDescrTit("DUPLICATA");	
		
		for(F55IJC83 f : vencimentoNFeList){			
			TpDuplicatas d = TpDuplicatasVO.montaDuplicata(f);						
			dList.add(d);			
			valorLiquido = valorLiquido.add(f.getJCAEXP().divide(new BigDecimal("100")));		
			cobranca.setDmIndTit(f.getJCKI03());
		}	
		
		cobranca.setVlLiquido(valorLiquido);		
		
		TpDuplicatas[] duplicatasList = Arrays.copyOf(dList.toArray(), dList.toArray().length, TpDuplicatas[].class);
		cobranca.setDuplicatas(duplicatasList);
		
		return cobranca;
	}
	
	
}
