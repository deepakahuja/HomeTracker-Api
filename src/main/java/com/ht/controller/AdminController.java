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
import com.ht.controller.requesthandler.SaveUsersHandler;
import com.ht.pojo.request.admin.User;

@RestController
@CrossOrigin(origins = "*")
public class AdminController {

	@Autowired
	BeanFactory beanFactory;
	
	/**
	 * Fetches users 
	 */
	@GetMapping(path = "/admin/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> fetchUsers(HttpServletRequest request) throws Exception {

		FetchUsersHandler handler = beanFactory.getBean(FetchUsersHandler.class);
		return (ResponseEntity<?>) handler.handleRequest(null, null, null);
	}
	
	/**
	 * Insert 1 user 
	 */
	@PostMapping(path = "/admin/users", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveUser(@RequestBody User user, BindingResult bindingResult, HttpServletRequest request)
			throws Exception {

		SaveUsersHandler handler = beanFactory.getBean(SaveUsersHandler.class);
		return (ResponseEntity<?>) handler.handleRequest(user, bindingResult, null);
	}

	/**
	 * Update 1 user 
	 */
	@PutMapping(path = "/admin/users/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> updateUser(@RequestBody User user, BindingResult bindingResult,
			HttpServletRequest request) {

		return new ResponseEntity<>("temporary text", HttpStatus.OK);

	}
	
	/**
	 * Deletes 1 user 
	 */
	@DeleteMapping(path = "/admin/users/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> deleteUser(@RequestBody User user, BindingResult bindingResult,
			HttpServletRequest request) {

		return new ResponseEntity<>("temporary text", HttpStatus.OK);

	}	 
}
