package br.com.bv.nfe.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

import br.com.compliance.nfe.util.AppConfig;

public class StatusProperties {	
	
	public static HashMap<String, String> getStatus() throws IOException{
		InputStream input = new FileInputStream("C:/Java/resources/status.properties");
		//InputStream input = new FileInputStream(AppConfig.getSTATUS_PATH());
		Properties properties = new Properties();
		properties.load(input);	
		
		HashMap<String,String> mapStatus = new HashMap<String,String>();
		
		mapStatus.put("pedido", properties.getProperty( "status.pedido" ).trim());
		mapStatus.put("cancelamento", properties.getProperty( "status.cancelamento" ).trim());		
		mapStatus.put("nfPedidoLegadoNXTR", properties.getProperty( "status.nfPedidoLegadoNXTR" ).trim());
		mapStatus.put("nfPedidoLegadoLTTR", properties.getProperty( "status.nfPedidoLegadoLTTR" ).trim());
		mapStatus.put("cancelamentoContabilizado", properties.getProperty( "status.7611bNXTR" ).trim());
		
		return mapStatus;
		
	}

}
