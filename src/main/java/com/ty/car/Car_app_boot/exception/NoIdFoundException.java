package com.ty.car.Car_app_boot.exception;

public class NoIdFoundException extends RuntimeException {
	private String message = "given id is not exist";

	public NoIdFoundException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
