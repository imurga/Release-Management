package com.rm.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rm.services.LoginService;

@Controller("/login-service")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/validate/{id}", method = RequestMethod.GET)
	public boolean validateLogin (@PathVariable("id") String userId, @RequestParam("password") String password) {
		System.out.println("Run");
		return loginService.validateLogin(userId, password);
	}
}
