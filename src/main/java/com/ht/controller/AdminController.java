package com.ht.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ht.controller.requesthandler.FetchUsersHandler;
import com.ht.dto.productpurchaserecord.ProductPurchaseRecordDto;
import com.ht.entity.admin.AdminUsersEntity;

@RestController
@CrossOrigin(origins = "*")
public class AdminController {
	
	@Autowired
	BeanFactory beanFactory;
	
	@GetMapping(path="/admin/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> fetchUsers(/*@RequestBody ProductPurchaseRecordDto requestDto,
			BindingResult bindingResult, */HttpServletRequest request) throws Exception{
		
		FetchUsersHandler handler = beanFactory.getBean(FetchUsersHandler.class);
		return (ResponseEntity<?>)handler.handleRequest(null, null, null);
	}
	
	@PostMapping(path="/admin/users", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveUser(@RequestBody ProductPurchaseRecordDto requestDto,
			BindingResult bindingResult, HttpServletRequest request){
		
		//Iterable<AdminUsersEntity> users = service.fetchUsers();
		return new ResponseEntity<>("temporary text", HttpStatus.CREATED);
		
	}
	
	@PutMapping(path="/admin/users", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> updateUser(/*@RequestBody ProductPurchaseRecordDto requestDto,
			BindingResult bindingResult, */HttpServletRequest request){
		
		
		return new ResponseEntity<>("temporary text", HttpStatus.OK);
		
	}
	
	@DeleteMapping(path="/admin/users", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> deleteUser(/*@RequestBody ProductPurchaseRecordDto requestDto,
			BindingResult bindingResult, */HttpServletRequest request){
		
		return new ResponseEntity<>("temporary text", HttpStatus.OK);
		
	}
}
