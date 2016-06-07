package com.rm.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.rm.beans.ReleaseBean;
import com.rm.dao.entity.Release;
import com.rm.dao.repo.ReleaseRepository;
import com.rm.services.ReleaseService;

public class ReleaseServiceImpl implements ReleaseService {

	@Autowired
	private ReleaseRepository repository;

	@Override
	public ReleaseBean save(Release release) {
		 repository.save(release);
		 return null;
	}

}
