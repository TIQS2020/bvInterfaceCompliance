package br.com.bv.nfe.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.nfe.controle.EmissaoEntradaControle;

public class EmissaoEntradaException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger(EmissaoEntradaControle.class.getName());
	
	public EmissaoEntradaException(){
		super();		
	}
	
	public EmissaoEntradaException(String msg) {
		super( msg );
		log.error("JDBCException : " + msg);		
	}
	
	public EmissaoEntradaException(Throwable t){
		super( t );
		log.error("JDBCException : " + t.getMessage());
	}
	

}
