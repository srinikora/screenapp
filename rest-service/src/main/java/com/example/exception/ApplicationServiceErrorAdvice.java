package com.example.exception;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice(basePackages = "com.example.restservice")
@Slf4j
public class ApplicationServiceErrorAdvice {
	
	Logger log = Logger.getLogger(ApplicationServiceErrorAdvice.class.getName());
	
	@ExceptionHandler({RuntimeException.class, SQLException.class, NullPointerException.class})
	public ResponseEntity<String> handleRuntimeException(RuntimeException e){
		return error(HttpStatus.BAD_GATEWAY, e);
	}
	
	@ExceptionHandler({ResourceNotFoundException.class})
	public ResponseEntity<String> handleNotFoundException(ResourceNotFoundException e){
		return error(HttpStatus.NOT_FOUND, e);
	}
	
	private ResponseEntity<String> error(HttpStatus status, Exception e){
		log.log(Level.SEVERE , "Exception :::: " , e);
		return ResponseEntity.status(status).body(e.getMessage());
	}
}
