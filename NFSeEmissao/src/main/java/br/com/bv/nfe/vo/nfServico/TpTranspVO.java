package br.com.bv.nfe.vo.nfServico;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.axis.types.NonNegativeInteger;

import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC84;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpTransp;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpVeiculo;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpVolume;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj;

public class TpTranspVO {

	public static TpTransp montaTransporte(F55IJC80 header) throws Exception{
		// TODO Auto-generated method stub
		TpTransp transporte = new TpTransp();
		// transporte.setCodPartTransp("0");
		
		Integer modFrete = Integer.parseInt(header.getJCEV11().trim());
		
		if(modFrete.compareTo(9) == 0){
			transporte.setDmModFrete(new NonNegativeInteger("0"));
		}else{
			transporte.setDmModFrete(new NonNegativeInteger(header.getJCEV11()));
		}		

		TpVolume volume = new TpVolume();
		volume.setMarca(header.getJCR2());
		volume.setPesoBruto(header.getJCITWT().divide(new BigDecimal("10000")));
		volume.setPesoLiquido(header.getJCTOWT().divide(new BigDecimal("10000")));
		Integer qtde = header.getJCTOQN().divide(new BigDecimal("1000000")).intValue();
		volume.setQtdeVol(new BigInteger(qtde.toString()));
		volume.setEspecie(header.getJCEQUP());

		TpVolume[] volumeList = new TpVolume[1];
		volumeList[0] = volume;

		transporte.setVolume(volumeList);

		return transporte;
	}

	public static TpTransp montaTransporte(F55IJC80 header, F55IJC84 e) throws Exception{
		// TODO Auto-generated method stub
		TpTransp transporte = new TpTransp();
		TpCpfCnpj c = new TpCpfCnpj();
		c.setCnpj(e.getJCKY1());
		
		Integer modFrete = Integer.parseInt(header.getJCEV11().trim());
		
		if(modFrete.compareTo(9) == 0){
			transporte.setDmModFrete(new NonNegativeInteger("0"));
		}else{
			transporte.setDmModFrete(new NonNegativeInteger(header.getJCEV11()));
		}		
		
		transporte.setCodPartTransp(header.getJCANCR().toString());
		transporte.setCidade(e.getJCPP01());
		transporte.setCidadeIbge(e.getJCIDNO().toString());
		transporte.setCpfCnpj(c);
		transporte.setIe(e.getJCCMT1());
		transporte.setNome(e.getJCDQ01());
		transporte.setUf(header.getJCSTCD());
		transporte.setEnder(e.getJCQ60() + ", " + e.getJCPDSC());

		TpVolume volume = new TpVolume();
		volume.setEspecie(header.getJCEQUP());
		volume.setNroVolume(header.getJCREF());
		volume.setMarca(header.getJCR2());
		volume.setPesoBruto(header.getJCITWT().divide(new BigDecimal("10000")));
		volume.setPesoLiquido(header.getJCTOWT().divide(new BigDecimal("10000")));
		Integer qtde = header.getJCTOQN().divide(new BigDecimal("1000000")).intValue();
		volume.setQtdeVol(new BigInteger(qtde.toString()));

		TpVolume[] volumeList = new TpVolume[1];
		volumeList[0] = volume;
				
		TpVeiculo veiculo = new TpVeiculo();

		veiculo.setPlaca(header.getJCLICP());
		veiculo.setUf(header.getJCSTCD());
		//veiculo.setDmTipo(new NonNegativeInteger(header.getJCCRTY()));
		//FBARROS
		veiculo.setDmTipo(new NonNegativeInteger(header.getJCEV12()));
		TpVeiculo[] veiculoList = new TpVeiculo[1];
		veiculoList[0] = veiculo;

		//transporte.setVeiculo(veiculoList);
		transporte.setVolume(volumeList);

		return transporte;
	}

}
