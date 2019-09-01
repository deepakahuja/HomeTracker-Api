package com.ht.service.admin;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ht.entity.admin.AdminUsersEntity;
import com.ht.enums.MappingTypeEnum;
import com.ht.mapper.admin.FetchUsersMapper;
import com.ht.mapper.admin.SaveUserMapper;
import com.ht.mapper.admin.UpdateUserMapper;
import com.ht.pojo.request.admin.User;
import com.ht.pojo.request.admin.UserUpdateRequest;
import com.ht.pojo.response.admin.UserSearchDTO;
import com.ht.repository.admin.AdminClientRepo;
import com.ht.repository.admin.AdminUserRepo;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminUserRepo adminUserRepo;
	
	@Autowired
	AdminClientRepo adminClientRepo;
	
	@Autowired
	BeanFactory beanFactory;
	
	@Override
	public List<UserSearchDTO> fetchUsers() throws Exception{
		
		Iterable<AdminUsersEntity> users = adminUserRepo.findAll();
		
		FetchUsersMapper mapper = beanFactory.getBean(FetchUsersMapper.class);
		List<UserSearchDTO> response = (List<UserSearchDTO>)mapper.map(users, MappingTypeEnum.MAPTORESPONSE, null);
		return response;
	}
	
	
	@Override
	public int saveUser(User userToSave) throws Exception{
		
		int pk = adminClientRepo.findOneByName(userToSave.getClient());
		Map<String, Object> extraFields = new HashMap();
		extraFields.put("Fk_Admin_Client", Integer.toString(pk));
		
		SaveUserMapper mapper = beanFactory.getBean(SaveUserMapper.class);
		AdminUsersEntity userEntityToSave = (AdminUsersEntity)mapper.map(userToSave, MappingTypeEnum.MAPTOENTITY, extraFields);
		AdminUsersEntity savedUser = adminUserRepo.save(userEntityToSave);
		return savedUser.getPk();//although pk is coming out to be 0 in every case as of now but will look either we should return new pk or nothing but just HTTP status code to show that resource has been created.
	}


	@Override
	public void updateUser(UserUpdateRequest userToUpdate) throws Exception {
		
		Optional<AdminUsersEntity> adminUserEntityById = adminUserRepo.findById(Integer.valueOf(userToUpdate.getPk()));
		Map<String, Object> extraFields = new HashMap();
		extraFields.put("entityById", adminUserEntityById.get());
		
		UpdateUserMapper mapper = beanFactory.getBean(UpdateUserMapper.class);
		AdminUsersEntity userEntityToUpdate = (AdminUsersEntity)mapper.map(userToUpdate, MappingTypeEnum.MAPTOENTITY, extraFields);
		
		adminUserRepo.save(userEntityToUpdate);
	}


	@Override
	public void deleteUser(String idOfUserToBeDeleted) throws Exception {
		
		adminUserRepo.deleteById(Integer.parseInt(idOfUserToBeDeleted));
	}	 
}
