package com.rm.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.rm.beans.UserBean;
import com.rm.converters.UserConverter;
import com.rm.dao.entity.User;
import com.rm.dao.repo.UserRepo;
import com.rm.services.LoginService;

@Repository
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserRepo repository;

	@Override
	public UserBean validateLogin(String userId, String password) {

		UserBean bean = null;
		UserConverter converter = new UserConverter();

		List<User> users = (List<User>) repository.findAll();

		if (!CollectionUtils.isEmpty(users)) {

			User user = users.get(0);

			if (user.getPassword().equals(password)) {
				bean = converter.toBean(user);
			}

		}

		return bean;
	}
}
