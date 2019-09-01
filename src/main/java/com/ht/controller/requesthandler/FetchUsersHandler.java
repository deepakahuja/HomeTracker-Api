package com.ht.controller.requesthandler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.web.context.annotation.RequestScope;

import com.ht.dto.admin.UserSearchDTO;
import com.ht.service.admin.AdminService;

@Component
@RequestScope
public class FetchUsersHandler extends RestControllerHandler{
	
	@Autowired
	AdminService service;
	
	@Override
	protected void prepareHandler(Object requestDTO, BindingResult bindingResult, String... pathParams)
			throws Exception {
		// TODO Auto-generated method stub
		
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
		
		List<UserSearchDTO> userSearchDTOs = service.fetchUsers();
		return new ResponseEntity<List<UserSearchDTO>>(userSearchDTOs, HttpStatus.OK);		
	}
}
