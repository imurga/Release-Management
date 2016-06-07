package com.rm.converters;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import com.rm.beans.EnvironmentBean;
import com.rm.beans.MaterialBean;
import com.rm.dao.entity.Environment;
import com.rm.dao.entity.Material;

public class MaterialConverter {

	public MaterialBean toBean(Material material) {
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder()
				.build();
		mapperFactory.classMap(EnvironmentBean.class, Environment.class)
				.field("id", "id").field("type", "type")
				.field("description", "description").field("url", "url")
				.field("branch", "branch").register();
		MapperFacade mapper = mapperFactory.getMapperFacade();
		return mapper.map(material, MaterialBean.class);
	}

	public Material toEntity(MaterialBean materialBean) {
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder()
				.build();
		mapperFactory.classMap(Material.class, MaterialBean.class).register();

		MapperFacade mapper = mapperFactory.getMapperFacade();
		return mapper.map(materialBean, Material.class);
	}

}
