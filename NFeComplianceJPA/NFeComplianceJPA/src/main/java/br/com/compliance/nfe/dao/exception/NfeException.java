package br.com.compliance.nfe.dao.exception;

public class NfeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NfeException(){
		super();
	}
	
	public NfeException(String message){
		System.out.println(message);
	}

}
