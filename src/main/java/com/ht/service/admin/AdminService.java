package com.ht.service.admin;

import java.util.List;

import com.ht.dto.admin.UserDTO;

public interface AdminService {
	
	public List<UserDTO> fetchUsers();

}
