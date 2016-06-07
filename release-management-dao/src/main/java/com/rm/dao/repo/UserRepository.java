package com.rm.dao.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rm.dao.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
    
    List<User> findByUserName (String userName);
}