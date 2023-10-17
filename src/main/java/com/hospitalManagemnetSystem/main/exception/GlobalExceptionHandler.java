package com.hospitalManagemnetSystem.main.exception;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class GlobalExceptionHandler {

	
	
	
	
	@ExceptionHandler(ConstraintViolationException.class)
	public String ConstraintViolationExceptionExceptionHander(ConstraintViolationException e)
	{
		
	return "Enter all filed";
	}
}
