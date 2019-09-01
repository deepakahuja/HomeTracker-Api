package com.ht.service.admin;

import java.util.List;

import com.ht.pojo.request.admin.User;
import com.ht.pojo.response.admin.UserSearchDTO;

public interface AdminService {
	
	public List<UserSearchDTO> fetchUsers() throws Exception;
	
	public int saveUser(User userToSave) throws Exception;
}
