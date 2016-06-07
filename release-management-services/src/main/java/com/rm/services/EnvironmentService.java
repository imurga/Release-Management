package com.rm.services;

import java.util.List;

import com.rm.beans.EnvironmentBean;
import com.rm.dao.entity.Environment;

public interface EnvironmentService {

	public EnvironmentBean save(Environment environment);
	
	public List<EnvironmentBean> getAllEnvironment();
}
