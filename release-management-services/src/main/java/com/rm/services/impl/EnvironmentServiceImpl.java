package com.rm.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rm.beans.EnvironmentBean;
import com.rm.dao.entity.Environment;
import com.rm.dao.repo.EnvironmentRepository;
import com.rm.services.EnvironmentService;

public class EnvironmentServiceImpl implements EnvironmentService {

	@Autowired
	private EnvironmentRepository repository;

	@Override
	public EnvironmentBean save(Environment environment) {
		repository.save(environment);
		return null;
	}

	@Override
	public List<EnvironmentBean> getAllEnvironment() {
		
		List<Environment> environmentList = repository.findAll();
		return null;
	}


}
