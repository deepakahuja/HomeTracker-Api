package com.ht.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ht.dao.ProductPurchaseRecordDao;
import com.ht.pojo.response.productpurchaserecord.ProductPurchaseRecordDto;
import com.ht.service.ProductPurchaseService.ProductPurchaseService;

@RestController
@CrossOrigin(origins = "*")
public class ProductPurchaseController {
	
	@Autowired
	ProductPurchaseService service;
	
	@PostMapping(path = "/products/savepurchaserecord", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveProductPurchaseRecord(@RequestBody ProductPurchaseRecordDto requestDto,
			BindingResult bindingResult, HttpServletRequest request) {		
		
		ProductPurchaseRecordDao dao = new ProductPurchaseRecordDao();
		dao.setProductName(requestDto.getProductName());
		dao.setPurchaseDate(requestDto.getPurchaseDate());
		dao.setBoughtFrom(requestDto.getBoughtFrom());
		
		service.saveProduct(dao);
		return new ResponseEntity<>(HttpStatus.OK);

	}

}
