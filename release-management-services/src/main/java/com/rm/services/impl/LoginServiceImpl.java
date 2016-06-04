package com.rm.services.impl;

import org.springframework.stereotype.Repository;

import com.rm.services.LoginService;

@Repository
public class LoginServiceImpl implements LoginService {

	@Override
	public boolean validateLogin(String userId, String password) {
		
		if ("test".equals(userId) && "123123".equals(password)) {
			
			return true;
		}
		return false;
	}
}
