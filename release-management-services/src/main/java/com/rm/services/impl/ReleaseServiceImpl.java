package com.rm.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rm.beans.ReleaseBean;
import com.rm.converters.ReleaseConverter;
import com.rm.dao.entity.Release;
import com.rm.dao.repo.ReleaseRepository;
import com.rm.services.ReleaseService;

@Repository
public class ReleaseServiceImpl implements ReleaseService {

	@Autowired
	private ReleaseRepository repository;

	@Override
	public ReleaseBean save(ReleaseBean release) {

		ReleaseConverter converter = new ReleaseConverter();
		release.setDate(new Date());
		Release entity = repository.save(converter.toEntity(release));
		
		return converter.toBean(entity);
	}

	@Override
	public List<ReleaseBean> getAllRelease() {
		
		List<ReleaseBean> releaseList = new ArrayList<ReleaseBean>();
		ReleaseConverter converter = new ReleaseConverter();
		
		for (Release release : repository.findAll()) {
			releaseList.add(converter.toBean(release));
		}
		return releaseList;
	}

}
