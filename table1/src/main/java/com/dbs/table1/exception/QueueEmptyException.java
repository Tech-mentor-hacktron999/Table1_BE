package com.dbs.table1.exception;

public class QueueEmptyException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1464464646L;

	public QueueEmptyException(String message) {
		super(message);
	}

}
