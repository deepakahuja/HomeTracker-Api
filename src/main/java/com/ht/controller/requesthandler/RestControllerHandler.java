package com.ht.controller.requesthandler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.validation.BindingResult;

/**
 * Template Design Pattern Implementation for handling REST APIs business process execution
 * 
 * @author deepakahuja
 */
public abstract class RestControllerHandler {
	
	@Autowired
	protected HttpServletRequest request;
	
	@Autowired
	protected MessageSource messageSource;
	
	protected BindingResult bindingResult;
	
	protected abstract void prepareHandler(Object requestPojo, BindingResult bindingResult, String... pathParams) throws Exception;
	
	protected abstract void updateInputSearchCriteria() throws Exception;
	
	protected abstract void validateRequest();
	
	protected abstract Object processRequest() throws Exception;
	
	public final Object handleRequest(Object requestPojo, BindingResult bindingResult, String... pathParams) throws Exception{
		prepareHandler(requestPojo, bindingResult, pathParams);
		updateInputSearchCriteria();
		validateRequest();
		return processRequest();
	}
}
