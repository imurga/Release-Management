package com.rm.converters;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import com.rm.beans.EnvironmentBean;
import com.rm.beans.VariablesBean;
import com.rm.dao.entity.Environment;
import com.rm.dao.entity.Variable;

public class VariablesConverter {

	public VariablesBean toBean(Variable variable) {
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder()
				.build();
		mapperFactory.classMap(EnvironmentBean.class, Environment.class)
				.field("id", "id")
				.field("name", "name")
				.field("value", "value").register();
		MapperFacade mapper = mapperFactory.getMapperFacade();
		return mapper.map(variable, VariablesBean.class);
	}

	public Variable toEntity(VariablesBean variableBean) {
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder()
				.build();
		mapperFactory.classMap(Variable.class, VariablesBean.class).register();

		MapperFacade mapper = mapperFactory.getMapperFacade();
		return mapper.map(variableBean, Variable.class);
	}

}
