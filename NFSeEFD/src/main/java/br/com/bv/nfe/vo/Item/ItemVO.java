package br.com.bv.nfe.vo.Item;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.nfe.vo.EmissaoEFDVO;
import br.com.compliance.nfe.jde.domain.F55IJC71;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.Item;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj;

public class ItemVO {
	
	private static final Logger log = LogManager.getLogger(ItemVO.class.getClass());

	public static List<Item> montarItem(EmissaoEFDVO e) throws Exception {
		// TODO Auto-generated method stub
		
		log.info("## Montando Item ##");
		
		List<Item> itemList = new ArrayList<Item>();
		for(F55IJC71 f : e.getDetalheNFeList()){
			
			log.info("+ Código: " + f.getJCLITM());
			log.info("+ Tipo: " + f.getJCBCTF());
			
			TpCpfCnpj cpfCnpj = new TpCpfCnpj();
			cpfCnpj.setCnpj(f.getJCBCGT());
			Item item = new Item();	
			item.setCpfCnpj(cpfCnpj);
			item.setCodigoItem(f.getJCLITM());
			item.setSiglaUnidade(f.getJCUOM());
			item.setIndicacaoOrigem(new BigInteger(f.getJCBORI()));
			item.setTipoItem(f.getJCBCTF());
			item.setCodNCM(f.getJCBCLF());
			item.setDescricao(f.getJCDSC1() + " - " + f.getJCDSC2());			
			itemList.add(item);
		}
		
		return itemList;
	}
	
	

}
