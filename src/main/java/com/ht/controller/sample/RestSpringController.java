package com.ht.controller.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ht.dto.sample.Product;
import com.ht.service.sample.ProductService;

@RestController
@CrossOrigin(origins = "*")
public class RestSpringController {
	//@Autowired
	Product p;
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/hello")
	public String hello(){
	  return "Hello WOrld";
	}
	
	@RequestMapping(value = "/getProducts/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Product[] getProducts(@PathVariable("id") int i){
		System.out.println("Hello Sample Products **********************");
	  Product[] products = new Product[1];	  
	  p = service.getProductById(i);
	  products[0] = p;
	  return products;
	}
	
}
