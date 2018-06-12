package com.amdocs.neo.client.exception;

public class NeoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	String errorKey;
	String localizedMessage;

	public NeoException(String errorKey, String localizedMessage){
		super(localizedMessage);
		this.errorKey = errorKey;
		
	}
	
}
