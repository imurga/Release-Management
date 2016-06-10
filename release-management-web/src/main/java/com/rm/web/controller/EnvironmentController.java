package com.rm.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rm.beans.EnvironmentBean;
import com.rm.services.EnvironmentService;

@RestController
@RequestMapping("/environment-service")
public class EnvironmentController {

	@Autowired
	private EnvironmentService environmentService;

	@RequestMapping(value = "/getAllEnvironment", method = RequestMethod.GET)
	public List<EnvironmentBean> getAllEnvironment() {
		return environmentService.getAllEnvironment();
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public EnvironmentBean save(@RequestBody EnvironmentBean environment) {
		return environmentService.save(environment);
	}

}
