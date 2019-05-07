package com.java.controller.exception;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptHandler {
	private   static Logger logger = Logger.getLogger(GlobalExceptHandler.class);
	@ExceptionHandler(Exception.class)
	 public String handException(Exception ex){
		logger.debug(ex.getMessage());
		 return "error/error.jsp";
	 }

}
