package com.dbs.table1.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class ApiError {
	
	private String message;
	private HttpStatus httpStatus;
	private Date time;
	
	public ApiError(Exception ex, HttpStatus status)
	{
		this.message = ex.getMessage();
		this.httpStatus= status;
		this.time = new Date();
	}
}
