package com.ht.controller.requesthandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.context.annotation.RequestScope;

import com.ht.service.admin.AdminService;

@Component
@RequestScope
public class DeleteUserHandler extends RestControllerHandler{

	@Autowired
	AdminService service;
	
	String idOfUserToBeDeleted;
	
	@Override
	protected void prepareHandler(Object requestPojo, BindingResult bindingResult, String... pathParams)
			throws Exception {
		
		idOfUserToBeDeleted = pathParams[0];		
	}

	@Override
	protected void updateInputSearchCriteria() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void validateRequest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Object processRequest() throws Exception {
		
		service.deleteUser(this.idOfUserToBeDeleted);
		return null;
	}

}
