package br.com.bv.nfe.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.nfe.controle.EnvioControle;

public class EmissaoException extends Exception{
	
	private static final Logger log = LogManager.getLogger(EnvioControle.class.getName());
	
	public EmissaoException(){
		super();		
	}
	
	public EmissaoException(String msg) {
		super( msg );
		log.error("JDBCException : " + msg);		
	}
	
	public EmissaoException(Throwable t){
		super( t );
		log.error("JDBCException : " + t.getMessage());
	}
	

}
