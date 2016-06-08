package com.rm.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.rm.beans.EnvironmentBean;
import com.rm.converters.EnvironmentConverter;
import com.rm.dao.entity.Environment;
import com.rm.dao.repo.EnvironmentRepository;
import com.rm.services.EnvironmentService;

@Repository
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

		List<EnvironmentBean> beanList = new ArrayList<EnvironmentBean>();
		EnvironmentConverter converter = new EnvironmentConverter();

		List<Environment> environmentList = repository.findAll();
		System.out.println("environmentList" + environmentList);

		if (!CollectionUtils.isEmpty(environmentList)) {
			for (Environment environment : environmentList) {
				beanList.add(converter.toBean(environment));
			}
		}
		return beanList;
	}

}
