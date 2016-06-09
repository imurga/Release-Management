package com.rm.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rm.beans.ReleaseBean;
import com.rm.services.ReleaseService;

@RestController
@RequestMapping("/release-service")
public class ReleaseController {

	@Autowired
	private ReleaseService releaseService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ReleaseBean save(@RequestBody ReleaseBean release) {
		System.out.println(release);
		
		return releaseService.save(release);
	}
	
	@RequestMapping(value = "/getAllRelease", method = RequestMethod.GET)
	public List<ReleaseBean> getAllRelease() {
		return releaseService.getAllRelease();
	}

}
