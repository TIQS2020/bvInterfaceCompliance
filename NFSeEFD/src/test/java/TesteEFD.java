import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import br.com.bv.nfe.controle.EmissaoEFDControle;
import br.com.bv.nfe.vo.ServicesVO;

public class TesteEFD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InputStream input = new FileInputStream("c:/Java/resources/webservices.properties");
			Properties properties = new Properties();
			properties.load(input);

			String consultaServiceURL = properties.getProperty("consultaGenerica").trim();			
			String participanteServiceURL = properties.getProperty("participante").trim();
			String itemServiceURL = properties.getProperty("item").trim();					
			String servicoEFD = properties.getProperty("servicoEFD").trim();
			
			EmissaoEFDControle eCtrl = new EmissaoEFDControle();

			ServicesVO servicesVO = new ServicesVO();
			servicesVO.setConsultaServiceURL(consultaServiceURL);			
			servicesVO.setItemServiceURL(itemServiceURL);			
			servicesVO.setParticipanteServiceURL(participanteServiceURL);		
			servicesVO.setEmissaoEFD(servicoEFD);

			eCtrl.inicializaProcesso(servicesVO);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
