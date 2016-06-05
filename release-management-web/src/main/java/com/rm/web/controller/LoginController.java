package com.rm.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rm.beans.UserBean;
import com.rm.services.LoginService;

@RestController
@RequestMapping("/login-service")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/validate", method = RequestMethod.GET)
	public UserBean validateLogin(
			@RequestParam(value = "id", required = true) String userId,
			@RequestParam("password") String password) {
		return loginService.validateLogin(userId, password);
	}

}
