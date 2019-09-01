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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ht.controller.requesthandler.DeleteUserHandler;
import com.ht.controller.requesthandler.FetchUsersHandler;
import com.ht.controller.requesthandler.SaveUsersHandler;
import com.ht.controller.requesthandler.UpateUserHandler;
import com.ht.pojo.request.admin.User;
import com.ht.pojo.request.admin.UserUpdateRequest;

@RestController
@CrossOrigin(origins = "*")
public class AdminController {

	@Autowired
	BeanFactory beanFactory;
	
	/**
	 * Fetches 1 or more users 
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
	public ResponseEntity<?> updateUser(@PathVariable("id") int id, @RequestBody UserUpdateRequest user,
			BindingResult bindingResult, HttpServletRequest request) throws Exception {

		UpateUserHandler handler = beanFactory.getBean(UpateUserHandler.class);
		handler.handleRequest(user, bindingResult, Integer.toString(id));
		return new ResponseEntity<>(HttpStatus.OK);

	}
	
	/**
	 * Deletes 1 user 
	 */
	@DeleteMapping(path = "/admin/users/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> deleteUser(@PathVariable("id") int id, HttpServletRequest request) throws Exception {

		DeleteUserHandler handler = beanFactory.getBean(DeleteUserHandler.class);
		handler.handleRequest(null, null, Integer.toString(id));
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}	 
}
