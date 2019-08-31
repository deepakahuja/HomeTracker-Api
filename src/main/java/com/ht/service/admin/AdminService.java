package com.ht.service.admin;

import com.ht.entity.admin.AdminUsersEntity;

public interface AdminService {
	
	public Iterable<AdminUsersEntity> fetchUsers();
	
	//public AdminClientsEntity saveUser();
}
