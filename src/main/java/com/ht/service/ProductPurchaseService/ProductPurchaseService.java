package com.ht.service.ProductPurchaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.dao.ProductPurchaseRecordDao;
import com.ht.repository.productpurchaserecordrepository.ProductPurchaseRecordRepository;

@Service
public class ProductPurchaseService {
	
	@Autowired
	ProductPurchaseRecordRepository repository;
	
	public int saveProduct(ProductPurchaseRecordDao dao){
		int pk = repository.save(dao).getPk();
		return pk;
	}

}
