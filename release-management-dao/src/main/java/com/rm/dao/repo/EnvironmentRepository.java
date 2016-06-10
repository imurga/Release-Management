package com.rm.dao.repo;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rm.dao.entity.Environment;

@Repository
public interface EnvironmentRepository extends MongoRepository<Environment, Integer> {
	
	AtomicInteger ID = new AtomicInteger();
    
    List<Environment> findByDescription (String descriptione);
}