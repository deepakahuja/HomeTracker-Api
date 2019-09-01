package com.ht.repository.admin;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ht.entity.admin.AdminClientsEntity;

@Repository
public interface AdminClientRepo extends CrudRepository<AdminClientsEntity, Integer>{
	
	@Query(value = "SELECT ac.pk FROM AdminClientsEntity as ac WHERE ac.clientName= :clientName")
	int findOneByName(@Param("clientName") String clientName);
}
