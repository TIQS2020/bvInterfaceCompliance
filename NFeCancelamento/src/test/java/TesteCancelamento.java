import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import br.com.bv.nfe.controle.CancelamentoControle;
import br.com.bv.nfe.vo.ServicesVO;
import br.com.nfe.xml.retorno.vo.CaminhosVO;

public class TesteCancelamento {
	
	public static void main(String[] args){
		 try{        	
	        	InputStream input = new FileInputStream("c:/Java/resources/webservices.properties");
	    		Properties properties = new Properties();
	    		properties.load(input);	
	    		
	    		String cancelamentoServiceURL = properties.getProperty( "cancelamento" ).trim();
	    		String consultaServiceURL = properties.getProperty( "consultaGenerica" ).trim();	    		
	        	
	        	CancelamentoControle cancelCtrl = new CancelamentoControle();   		
	    		ServicesVO servicesVO = new ServicesVO();
	    		servicesVO.setCancelamentoServiceURL(cancelamentoServiceURL);
	    		servicesVO.setConsultaServiceURL(consultaServiceURL);

				 CaminhosVO caminhosVO = new CaminhosVO(properties.getProperty("cancelamentoRecebidoXML").trim(),
						 properties.getProperty("cancelamentoProcessamentoXML").trim(),properties.getProperty("cancelamentoFinalizadoXML").trim(),
						 properties.getProperty("cancelamentoErroXML").trim());

				 cancelCtrl.inicializaProcesso(servicesVO, caminhosVO);
	    		
	        }catch(Exception ex){
	        	ex.printStackTrace();	
	        } 
	}

}
