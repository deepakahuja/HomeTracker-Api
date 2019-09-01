package com.ht.mapper.admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.ht.entity.admin.AdminUsersEntity;
import com.ht.mapper.Mapper;
import com.ht.pojo.response.admin.UserSearchDTO;

@Component
public class FetchUsersMapper extends Mapper{

	@Override
	protected Object maptToEntity(Object objToMap, Map<String, String> extraFields) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Object maptToResponse(Object objToMap, Map<String, String> extraFields) throws Exception {
		Iterable<AdminUsersEntity> resultSets = (Iterable<AdminUsersEntity>)objToMap;
		List<UserSearchDTO> response = new ArrayList();
		for(AdminUsersEntity resultSet : resultSets) {
			UserSearchDTO dto = new UserSearchDTO();
			dto.setEmail(resultSet.getEmail());
			dto.setPhone(resultSet.getPhone());
			dto.setName(resultSet.getFirstName()+" "+resultSet.getLastName());
			dto.setClient(resultSet.getFkAdminClients().getClientName());
			dto.setCreationDate(resultSet.getCreatedOn());
			response.add(dto);
		}
		return response;
	}
}
