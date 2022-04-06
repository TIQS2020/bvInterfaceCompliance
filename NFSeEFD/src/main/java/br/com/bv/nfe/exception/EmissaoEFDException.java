package br.com.bv.nfe.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.nfe.controle.EmissaoEFDControle;

public class EmissaoEFDException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger(EmissaoEFDControle.class.getName());
	
	public EmissaoEFDException(){
		super();		
	}
	
	public EmissaoEFDException(String msg) {
		super( msg );
		log.error("JDBCException : " + msg);		
	}
	
	public EmissaoEFDException(Throwable t){
		super( t );
		log.error("JDBCException : " + t.getMessage());
	}
	

}
