package com.ht.mapper.admin;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.ht.entity.admin.AdminClientsEntity;
import com.ht.entity.admin.AdminUsersEntity;
import com.ht.mapper.Mapper;
import com.ht.pojo.request.admin.User;

@Component
public class SaveUserMapper extends Mapper{

	@Override
	protected Object maptToEntity(Object objToMap, Map<String, Object> extraFields) throws Exception {
		
		AdminUsersEntity userEntityToSave = new AdminUsersEntity();
		User userToSave = (User)objToMap;
		userEntityToSave.setFirstName(userToSave.getFirstName());
		userEntityToSave.setLastName(userToSave.getLastName());
		userEntityToSave.setEmail(userToSave.getEmail());
		userEntityToSave.setActive(1);
		AdminClientsEntity clientEntity = new AdminClientsEntity();
		clientEntity.setPk(Integer.parseInt((String)extraFields.get("Fk_Admin_Client")));
		userEntityToSave.setFkAdminClients(clientEntity);
		userEntityToSave.setPhone(userToSave.getPhone());
		return userEntityToSave;
	}

	@Override
	protected Object maptToResponse(Object objToMap, Map<String, Object> extraFields) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
