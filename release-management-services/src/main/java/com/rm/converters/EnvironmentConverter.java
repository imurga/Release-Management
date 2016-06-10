package com.rm.converters;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import com.rm.beans.EnvironmentBean;
import com.rm.dao.entity.Environment;

public class EnvironmentConverter {

	public EnvironmentBean toBean(Environment environment) {
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder()
				.build();
		mapperFactory.classMap(EnvironmentBean.class, Environment.class)
				.field("id", "id").field("name", "name")
				.field("description", "description").field("enable", "enable")
				.field("release", "release").field("variable1", "variable1")
				.field("variable2", "variable2")
				.field("variable3", "variable3").register();
		MapperFacade mapper = mapperFactory.getMapperFacade();
		return mapper.map(environment, EnvironmentBean.class);
	}

	public Environment toEntity(EnvironmentBean environmentBean) {
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder()
				.build();
		mapperFactory.classMap(Environment.class, EnvironmentBean.class)
				.field("id", "id").field("name", "name")
				.field("description", "description").field("enable", "enable")
				.field("release", "release").field("variable1", "variable1")
				.field("variable2", "variable2")
				.field("variable3", "variable3").register();

		MapperFacade mapper = mapperFactory.getMapperFacade();
		return mapper.map(environmentBean, Environment.class);
	}

}
