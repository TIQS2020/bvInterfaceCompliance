
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import br.com.bv.nfe.controle.EmissaoEntradaControle;
import br.com.bv.vo.ServicesVO;

public class TesteEmissaoEntrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InputStream input = new FileInputStream("c:/Java/resources/webservices.properties");
			Properties properties = new Properties();
			properties.load(input);

			String consultaServiceURL = properties.getProperty("consultaGenerica").trim();

			String participanteServiceURL = properties.getProperty("participante").trim();
			String itemServiceURL = properties.getProperty("item").trim();
			String emissaoEntradaServiceURL = properties.getProperty("emissaoEntrada").trim();
			String natOpServiceURL = properties.getProperty("naturezaOperacao").trim();
			String servicoEFD = properties.getProperty("servicoEFD").trim();
			String emissaoNFSeContServiceURL = properties.getProperty("emissaoNFSeCont").trim();	
			
			ServicesVO servicesVO = new ServicesVO();
			servicesVO.setConsultaServiceURL(consultaServiceURL);
			servicesVO.setItemServiceURL(itemServiceURL);
			servicesVO.setParticipanteServiceURL(participanteServiceURL);
			servicesVO.setEmissaoEntradaServiceURL(emissaoEntradaServiceURL);
			servicesVO.setNatOpServiceURL(natOpServiceURL);
			servicesVO.setEmissaoEFDURL(servicoEFD);
			servicesVO.setEmissaoNFSeContServiceURL(emissaoNFSeContServiceURL);
			// servicesVO.setUnidadeServiceURL(unidadeServiceURL);
			
			EmissaoEntradaControle eCtrl = new EmissaoEntradaControle();
			eCtrl.inicializaProcesso(servicesVO);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
