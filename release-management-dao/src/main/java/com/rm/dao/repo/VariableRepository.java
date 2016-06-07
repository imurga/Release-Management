package com.rm.dao.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rm.dao.entity.Variable;

@Repository
public interface VariableRepository extends MongoRepository<Variable, Long> {
    
}