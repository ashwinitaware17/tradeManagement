package com.sbi.trade.exception;

public class TradeNotFoundException extends RuntimeException{
	
	private final String message;

	public TradeNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	
	
	
	
	

}
