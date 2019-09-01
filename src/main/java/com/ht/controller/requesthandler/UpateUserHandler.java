package com.ht.controller.requesthandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.context.annotation.RequestScope;

import com.ht.pojo.request.admin.User;
import com.ht.pojo.request.admin.UserUpdateRequest;
import com.ht.service.admin.AdminService;

@Component
@RequestScope
public class UpateUserHandler extends RestControllerHandler{

	@Autowired
	AdminService service;
	
	UserUpdateRequest userToUpdate;
	
	String idOfUserToBeUpdated;
	
	@Override
	protected void prepareHandler(Object requestPojo, BindingResult bindingResult, String... pathParams)
			throws Exception {
		
		this.userToUpdate = (UserUpdateRequest)requestPojo;
		idOfUserToBeUpdated = pathParams[0];
	}

	@Override
	protected void updateInputSearchCriteria() throws Exception {
		
		userToUpdate.setPk(idOfUserToBeUpdated);
	}

	@Override
	protected void validateRequest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Object processRequest() throws Exception {
		
		service.updateUser(userToUpdate);
		return null;
	}

}
