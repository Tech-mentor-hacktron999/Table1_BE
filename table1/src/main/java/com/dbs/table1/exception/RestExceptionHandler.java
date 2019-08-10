package com.dbs.table1.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(Throwable.class)
	public Object handleThrowable(Exception ex,WebRequest request) {
		
		return handleExceptionInternal(ex, new ApiError(ex, HttpStatus.INTERNAL_SERVER_ERROR), 
		          new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
	}

}
