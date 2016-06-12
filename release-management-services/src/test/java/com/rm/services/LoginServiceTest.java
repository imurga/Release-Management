package com.rm.services;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.rm.beans.UserBean;
import com.rm.converters.UserConverter;
import com.rm.dao.entity.User;
import com.rm.dao.repo.UserRepository;
import com.rm.services.impl.LoginServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class LoginServiceTest{

	@InjectMocks
	private LoginService loginService = new LoginServiceImpl();
	
	@Mock
	private UserConverter converter;
	
	@Mock
	private UserRepository repository;
	
	@Test
	public void validateLogin(){
		
		String userName = "test";
		String password = "test";
		
		when(repository.findByUserName(userName)).thenReturn(getUsersList());
		
		when(converter.toBean(getUser())).thenReturn(getUserBean());
		
		UserBean userBean = loginService.validateLogin(userName, password);
		
		Assert.assertNotNull(userBean);
		
		Assert.assertEquals(userBean.getUserName(), userName);
	}
	
	@Test
	public void emptyLogin(){
		
		String userName = "test";
		String password = "test";
		
		when(repository.findByUserName(userName)).thenReturn(new ArrayList<>());
		
		UserBean userBean = loginService.validateLogin(userName, password);
		
		Assert.assertNull(userBean);
	}

	private UserBean getUserBean() {
		UserBean userBean = new UserBean();
		userBean.setUserName("test");
		userBean.setPassword("test");
		return userBean;
	}

	private List<User> getUsersList() {
		List<User> userList = new ArrayList<User>();
		userList.add(getUser());
		return userList;
	}
	
	private User getUser(){
		User user = new User();
		user.setUserName("test");
		user.setPassword("test");
		return user;
	}
}