package com.ht.repository.productpurchaserecordrepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ht.dao.ProductPurchaseRecordDao;

@Repository
public interface ProductPurchaseRecordRepository  extends CrudRepository<ProductPurchaseRecordDao, Integer>{

}
