package br.com.bv.nfe.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class StatusProperties {	
	
	public static HashMap<String, String> getStatus() throws IOException{
		InputStream input = new FileInputStream("C:/Java/resources/status.properties");
		Properties properties = new Properties();
		properties.load(input);	
		
		HashMap<String,String> mapStatus = new HashMap<String,String>();
		
		mapStatus.put("pedido", properties.getProperty( "status.pedido" ).trim());
		mapStatus.put("cancelamento", properties.getProperty( "status.cancelamento" ).trim());
		mapStatus.put("inutilizacao", properties.getProperty( "status.inutilizacao" ).trim());
		mapStatus.put("denegacao", properties.getProperty( "status.denegacao" ).trim());
		mapStatus.put("standAlone", properties.getProperty( "status.standAlone" ).trim());
		
		return mapStatus;
		
	}

}
