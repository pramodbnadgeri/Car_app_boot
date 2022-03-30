package com.ty.car.Car_app_boot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CarAppExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(NoIdFoundException.class)
	public ResponseEntity<String> handleNoIdFoundException(NoIdFoundException idFoundException) {
		String message = idFoundException.getMessage();
		ResponseEntity<String> responseEntity = new ResponseEntity<String>(message, HttpStatus.NOT_FOUND);
		return responseEntity;
	}

}
