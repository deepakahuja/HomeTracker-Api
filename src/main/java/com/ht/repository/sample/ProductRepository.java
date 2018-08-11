package com.ht.repository.sample;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ht.dto.sample.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

}
