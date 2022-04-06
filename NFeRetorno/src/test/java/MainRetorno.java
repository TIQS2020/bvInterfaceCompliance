import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import br.com.bv.nfe.controle.RetornoControle;
import br.com.compliance.nfe.util.AppConfig;

public class MainRetorno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InputStream input = new FileInputStream(AppConfig.getWEB_SERVICES_PATH());

			Properties properties = new Properties();
			properties.load(input);

			String retornoServiceURL = properties.getProperty("consultaGenerica").trim();

			RetornoControle rCtrl = new RetornoControle();
			rCtrl.inicializaProcesso(retornoServiceURL);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
