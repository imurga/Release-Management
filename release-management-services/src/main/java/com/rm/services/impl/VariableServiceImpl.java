package com.rm.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.rm.beans.VariablesBean;
import com.rm.dao.entity.Variable;
import com.rm.dao.repo.VariableRepository;
import com.rm.services.VariableService;

public class VariableServiceImpl implements VariableService {

	@Autowired
	private VariableRepository repository;

	@Override
	public VariablesBean save(Variable variable) {
		repository.save(variable);
		return null;
	}

}
