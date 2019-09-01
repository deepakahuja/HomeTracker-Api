package com.ht.service.sample;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.entity.product.ProductEntity;
import com.ht.repository.sample.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repository;
	
	public ProductEntity getProductById(Integer i){
		Optional<ProductEntity> p = repository.findById(i);
		return p.get();
	}

}
