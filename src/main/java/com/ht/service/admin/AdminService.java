package com.ht.service.admin;

import java.util.List;

import com.ht.dto.admin.UserSearchDTO;

public interface AdminService {
	
	public List<UserSearchDTO> fetchUsers() throws Exception;
	
	//public AdminClientsEntity saveUser();
}
