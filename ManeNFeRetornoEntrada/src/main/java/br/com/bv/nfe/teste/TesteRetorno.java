package br.com.bv.nfe.teste;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import br.com.bv.nfe.controle.RetornoEntradaControle;

public class TesteRetorno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RetornoEntradaControle rEntradaCtrl = new RetornoEntradaControle();
		
		
		try{
        	InputStream input = new FileInputStream("C:/Java/resources/webservices.properties");
    		Properties properties = new Properties();
    		properties.load(input);	
    		
    		String consultaServiceURL = properties.getProperty( "consultaGenerica" ).trim();
    		rEntradaCtrl.inicializaProcesso(consultaServiceURL);
		}catch(Exception ex){
        	ex.printStackTrace();
        	
        } 
		
		
	}

}
