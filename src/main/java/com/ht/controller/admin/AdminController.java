package com.ht.controller.admin;

import javax.servlet.http.HttpServletRequest;

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

import com.ht.dto.productpurchaserecord.ProductPurchaseRecordDto;
import com.ht.entity.admin.AdminUsersEntity;
import com.ht.service.admin.AdminService;

@RestController
@CrossOrigin(origins = "*")
public class AdminController {
	
	@Autowired
	AdminService service;
	
	@GetMapping(path="/admin/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getUsers(/*@RequestBody ProductPurchaseRecordDto requestDto,
			BindingResult bindingResult, */HttpServletRequest request){
		
		Iterable<AdminUsersEntity> users = service.fetchUsers();
		return new ResponseEntity<>(users, HttpStatus.OK);
		
	}
	
	@PostMapping(path="/admin/users", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveUser(@RequestBody ProductPurchaseRecordDto requestDto,
			BindingResult bindingResult, HttpServletRequest request){
		
		Iterable<AdminUsersEntity> users = service.fetchUsers();
		return new ResponseEntity<>(users, HttpStatus.CREATED);
		
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
