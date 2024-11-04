import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import br.com.bv.nfe.controle.EnvioControle;
import br.com.bv.vo.ServicesVO;
import br.com.nfe.xml.retorno.vo.CaminhosVO;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
System.out.println("RODANDO");
		try {
			InputStream input = new FileInputStream("c:/Java/resources/webservices.properties");
			Properties properties = new Properties();
			properties.load(input);

			String consultaServiceURL = properties.getProperty("consultaGenerica").trim();
			String envioNFeServiceURL = properties.getProperty("emissaoServico").trim();
			String participanteServiceURL = properties.getProperty("participante").trim();
			String itemServiceURL = properties.getProperty("item").trim();
			String unidadeServiceURL = properties.getProperty("unidade").trim();
			String natOpServiceURL = properties.getProperty("naturezaOperacao").trim();
			String paramIcmsServiceURL = properties.getProperty("parametrosICMS").trim();
			String infoComplDocServiceURL = properties.getProperty("infoComplDoc").trim();
			// String servicoServiceURL = properties.getProperty("servicoEFD").trim();

			EnvioControle eCtrl = new EnvioControle();

			ServicesVO servicesVO = new ServicesVO();
			servicesVO.setConsultaServiceURL(consultaServiceURL);
			servicesVO.setEnvioNFeServiceURL(envioNFeServiceURL);
			servicesVO.setInfoComplDocServiceURL(infoComplDocServiceURL);
			servicesVO.setItemServiceURL(itemServiceURL);
			servicesVO.setNatOpServiceURL(natOpServiceURL);
			servicesVO.setParamIcmsServiceURL(paramIcmsServiceURL);
			servicesVO.setParticipanteServiceURL(participanteServiceURL);
			servicesVO.setUnidadeServiceURL(unidadeServiceURL);
			// servicesVO.setServicoServiceURL(servicoServiceURL);

			CaminhosVO caminhosVO = new CaminhosVO(properties.getProperty("envioRecebidoXML").trim(),
					properties.getProperty("envioProcessamentoXML").trim(),properties.getProperty("envioFinalizadoXML").trim(),
					properties.getProperty("envioErroXML").trim());

			eCtrl.inicializaProcesso(servicesVO, caminhosVO);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
