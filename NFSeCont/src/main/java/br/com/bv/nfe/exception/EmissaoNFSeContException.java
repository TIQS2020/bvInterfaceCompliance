package br.com.bv.nfe.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.nfe.controle.EmissaoNFSeContControle;

public class EmissaoNFSeContException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger(EmissaoNFSeContControle.class.getName());
	
	public EmissaoNFSeContException(){
		super();		
	}
	
	public EmissaoNFSeContException(String msg) {
		super( msg );
		log.error("JDBCException : " + msg);		
	}
	
	public EmissaoNFSeContException(Throwable t){
		super( t );
		log.error("JDBCException : " + t.getMessage());
	}
	

}
