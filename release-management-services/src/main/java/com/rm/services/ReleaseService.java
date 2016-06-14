package com.rm.services;

import java.util.List;

import com.rm.beans.ReleaseBean;

public interface ReleaseService {

	public ReleaseBean save(ReleaseBean release);
	
	public List<ReleaseBean> getAllRelease();
	
	public boolean delete(Integer id);
}
