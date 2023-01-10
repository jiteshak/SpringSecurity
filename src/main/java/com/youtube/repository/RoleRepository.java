package com.youtube.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.youtube.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, String>{

}
