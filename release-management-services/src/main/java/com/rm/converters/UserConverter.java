package com.rm.converters;

import com.rm.beans.UserBean;
import com.rm.dao.entity.User;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class UserConverter {

	public UserBean toBean(User user) {
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder()
				.build();
		mapperFactory.classMap(UserBean.class, User.class)
				.field("userId", "userId").field("userName", "userName")
				.field("password", "password").field("email", "email")
				.field("possition", "possition").register();
		MapperFacade mapper = mapperFactory.getMapperFacade();
		return mapper.map(user, UserBean.class);
	}

	public User toEntity(UserBean userBean) {
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder()
				.build();
		mapperFactory.classMap(User.class, UserBean.class).register();

		MapperFacade mapper = mapperFactory.getMapperFacade();
		return mapper.map(userBean, User.class);
	}

}
