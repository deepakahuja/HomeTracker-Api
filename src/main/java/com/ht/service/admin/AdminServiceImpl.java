package com.ht.service.admin;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.dto.admin.UserSearchDTO;
import com.ht.entity.admin.AdminUsersEntity;
import com.ht.enums.MappingTypeEnum;
import com.ht.mapper.admin.FetchUsersMapper;
import com.ht.repository.admin.AdminRepo;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminRepo repository;
	
	@Autowired
	BeanFactory beanFactory;
	
	@Override
	public List<UserSearchDTO> fetchUsers() throws Exception{
		
		Iterable<AdminUsersEntity> users = repository.findAll();
		
		FetchUsersMapper mapper = beanFactory.getBean(FetchUsersMapper.class);
		List<UserSearchDTO> response = (List<UserSearchDTO>)mapper.map(users, MappingTypeEnum.MAPTORESPONSE, null);
		return response;
	}
	
	/*
	 * @Override public AdminClientsEntity saveUser() { AdminClientsEntity
	 * requestEntity = new AdminClientsEntity(); AdminClientsEntity savedEntity =
	 * repository.save(requestEntity); return savedEntity; }
	 */
}
