package com.ht.controller.requesthandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.context.annotation.RequestScope;

import com.ht.pojo.request.admin.User;
import com.ht.service.admin.AdminService;

@Component
@RequestScope
public class SaveUsersHandler extends RestControllerHandler{
	
	@Autowired
	AdminService service;
	
	User requestPojo;
	
	@Override
	protected void prepareHandler(Object requestPojo, BindingResult bindingResult, String... pathParams)
			throws Exception {
		
		this.requestPojo = (User)requestPojo;
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
		
		int id = service.saveUser(this.requestPojo);
		return new ResponseEntity<Integer>(id, HttpStatus.CREATED);
	}
}
