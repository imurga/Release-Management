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
		release.setDate(new Date());
		Release entity = ReleaseConverter.toEntity(release);
		entity.setId(ReleaseRepository.ID.getAndIncrement());
		entity = repository.save(entity);
		
		return ReleaseConverter.toBean(entity);
	}

	@Override
	public List<ReleaseBean> getAllRelease() {
		
		List<ReleaseBean> releaseList = new ArrayList<ReleaseBean>();
		
		for (Release release : repository.findAll()) {
			releaseList.add(ReleaseConverter.toBean(release));
		}
		return releaseList;
	}

	@Override
	public boolean delete(Integer id) {
		repository.delete(id);
		return true;
	}

}
