package com.ht.repository.admin;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ht.entity.admin.AdminUsersEntity;

@Repository
public interface AdminUserRepo extends CrudRepository<AdminUsersEntity, Integer>{

}
