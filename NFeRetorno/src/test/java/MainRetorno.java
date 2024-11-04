import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import br.com.bv.nfe.controle.RetornoControle;
import br.com.compliance.nfe.util.AppConfig;
import br.com.nfe.xml.retorno.vo.CaminhosVO;

public class MainRetorno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InputStream input = new FileInputStream(AppConfig.getWEB_SERVICES_PATH());

			Properties properties = new Properties();
			properties.load(input);

			String retornoServiceURL = properties.getProperty("consultaGenerica").trim();

			CaminhosVO caminhosVO = new CaminhosVO(null,null,properties.getProperty("retornoFinalizadoXML").trim(), null);

			RetornoControle rCtrl = new RetornoControle();
			rCtrl.inicializaProcesso(retornoServiceURL, caminhosVO);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
