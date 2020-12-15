package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2263994098099994552L;
	private int value;
	
	public ResourceNotFoundException(int value) {
		super(String.format("Application with id - %s not found to update.", value));
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
