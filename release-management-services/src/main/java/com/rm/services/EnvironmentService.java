package com.rm.services;

import java.util.List;

import com.rm.beans.EnvironmentBean;

public interface EnvironmentService {

	public EnvironmentBean save(EnvironmentBean environment);
	
	public List<EnvironmentBean> getAllEnvironment();
}
