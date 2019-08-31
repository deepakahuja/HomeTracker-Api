package com.ht.service.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.entity.admin.AdminUsersEntity;
import com.ht.repository.admin.AdminRepo;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepo repository;
	
	@Override
	public Iterable<AdminUsersEntity> fetchUsers() {
		
		Iterable<AdminUsersEntity> users = repository.findAll();
		return users;
	}
	
	/*
	 * @Override public AdminClientsEntity saveUser() { AdminClientsEntity
	 * requestEntity = new AdminClientsEntity(); AdminClientsEntity savedEntity =
	 * repository.save(requestEntity); return savedEntity; }
	 */
}
