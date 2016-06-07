package com.rm.dao.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rm.dao.entity.Release;

@Repository
public interface ReleaseRepository extends MongoRepository<Release, Long> {
    
}