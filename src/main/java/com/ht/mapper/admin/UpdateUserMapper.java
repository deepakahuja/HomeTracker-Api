package com.ht.mapper.admin;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.ht.entity.admin.AdminUsersEntity;
import com.ht.mapper.Mapper;
import com.ht.pojo.request.admin.UserUpdateRequest;

@Component
public class UpdateUserMapper extends Mapper{

	@Override
	protected Object maptToEntity(Object objToMap, Map<String, Object> extraFields) throws Exception {
		
		AdminUsersEntity userEntityToUpdate = (AdminUsersEntity)extraFields.get("entityById");
		UserUpdateRequest userToUpdate = (UserUpdateRequest)objToMap;
		
		if(userToUpdate.getFirstName()!= null && !userToUpdate.getFirstName().isEmpty()) {
			userEntityToUpdate.setFirstName(userToUpdate.getFirstName());
		}
		
		if(userToUpdate.getLastName()!= null && !userToUpdate.getLastName().isEmpty()) {
			userEntityToUpdate.setLastName(userToUpdate.getLastName());
		}
		
		if(userToUpdate.getEmail()!= null && !userToUpdate.getEmail().isEmpty()) {
			userEntityToUpdate.setEmail(userToUpdate.getEmail());
		}
		
		if(userToUpdate.getPhone()!= null && !userToUpdate.getPhone().isEmpty()) {
			userEntityToUpdate.setPhone(userToUpdate.getPhone());
		}		
		
		String active = userToUpdate.getActive();
		if(active!= null && !active.isEmpty()) {
			if("Y".equals(active)) {
				userEntityToUpdate.setActive(1);
			} else if("N".equals(active)) {
				userEntityToUpdate.setActive(0);
			}
		}
				
		return userEntityToUpdate;
	}

	@Override
	protected Object maptToResponse(Object objToMap, Map<String, Object> extraFields) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
