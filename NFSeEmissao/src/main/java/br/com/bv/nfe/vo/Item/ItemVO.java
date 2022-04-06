package br.com.bv.nfe.vo.Item;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.vo.EnvioVO;
import br.com.compliance.nfe.jde.domain.F55IJC81;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.Item;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj;

public class ItemVO {

	private static final Logger log = LogManager.getLogger(ItemVO.class.getClass());

	public static List<Item> montarItem(EnvioVO e) throws Exception {

		log.info("## Montando Item ##");

		List<Item> itemList = new ArrayList<Item>();

		for (F55IJC81 f : e.getDetalheNFeList()) {

			log.info("+ Código: " + f.getJCLITM());
			log.info("+ Tipo: " + f.getJCBCTF());

			TpCpfCnpj cpfCnpj = new TpCpfCnpj();

			cpfCnpj.setCnpj(f.getJCBCGF());

			Item item = new Item();

			item.setCpfCnpj(cpfCnpj);
			item.setNumeroItem(f.getJCUKID());
			item.setCodigoItem(f.getJCLITM());
			item.setSiglaUnidade(f.getJCUOM());
			// item.setIndicacaoOrigem(new BigInteger(f.getJCBORI()));
			item.setTipoItem(f.getJCBCTF());
			item.setCodNCM(f.getJCBCLF());
			item.setDescricao(f.getJCDSC1() + " - " + f.getJCDSC2());
			item.setCfop(f.getJCBRNOP());

			itemList.add(item);
		}

		return itemList;
	}

}
