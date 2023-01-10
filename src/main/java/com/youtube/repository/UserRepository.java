package com.youtube.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.youtube.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>{
	
}
