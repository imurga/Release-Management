package com.rm.dao.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.rm.dao.entity.User;

public interface UserRepo extends CrudRepository<User, Long> {
	
	@Query("{ 'userName' : ?0 }")
	public List<User> searchByUserName(String userName);
}
