package com.dbs.table1.exception;

public class MaxSizeReachedException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 146464646L;

	public MaxSizeReachedException(String message) {
		super(message);
	}

}
