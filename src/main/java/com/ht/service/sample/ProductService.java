package com.ht.service.sample;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.dto.sample.Product;
import com.ht.repository.sample.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repository;
	
	public Product getProductById(Integer i){
		Optional<Product> p = repository.findById(i);
		return p.get();
	}

}
