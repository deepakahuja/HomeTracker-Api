package com.ht.service.admin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ht.dto.admin.UserDTO;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Override
	public List<UserDTO> fetchUsers() {

		// Temporary Code to be replaced by DB call to fetch users
		UserDTO user1 = new UserDTO();
		user1.setActive("Y");
		user1.setFirstName("Deepak");
		user1.setLastName("Ahuja");
		user1.setEmail("deepakahuja999@gmail.com");
		UserDTO user2 = new UserDTO();
		user2.setActive("Y");
		user2.setFirstName("Shruti");
		user2.setLastName("Mehta");
		user2.setEmail("shrutiahuja999@gmail.com");
		UserDTO user3 = new UserDTO();
		user3.setActive("N");
		user3.setFirstName("Aarav");
		user3.setLastName("Ahuja");
		user3.setEmail("aaravahuja999@gmail.com");

		ArrayList<UserDTO> users = new ArrayList();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		return users;
	}
}
