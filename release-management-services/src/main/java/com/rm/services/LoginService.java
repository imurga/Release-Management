package com.rm.services;

import com.rm.beans.UserBean;

public interface LoginService {

	UserBean validateLogin(String userId, String password);
}
