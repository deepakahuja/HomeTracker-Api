package com.ht.controller.admin;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ht.dto.admin.UserDTO;
import com.ht.service.admin.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService service;
	
	@GetMapping(path="/admin/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getUsers(/*@RequestBody ProductPurchaseRecordDto requestDto,
			BindingResult bindingResult, */HttpServletRequest request){
		
		List<UserDTO> users = service.fetchUsers();
		return new ResponseEntity<>(users, HttpStatus.OK);
		
	}

}
