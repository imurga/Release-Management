package com.rm.dao.repo;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rm.dao.entity.Release;

@Repository
public interface ReleaseRepository extends MongoRepository<Release, Integer> {
    
	AtomicInteger ID = new AtomicInteger();
}