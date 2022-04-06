package br.com.compliance.nfe.jdbc;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JDBCException extends Exception{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger(JDBCException.class.getName());
	
	public JDBCException(){
		super();
	}
	
	public JDBCException(String msg) {
		super( msg );
		log.error("JDBCException : " + msg);		
	}
	
	public JDBCException(Throwable t){
		super( t );
		log.error("JDBCException : " + t);
	}


}
