package com.rm.converters;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import com.rm.beans.EnvironmentBean;
import com.rm.beans.ReleaseBean;
import com.rm.dao.entity.Environment;
import com.rm.dao.entity.Release;

public class ReleaseConverter {

	public ReleaseBean toBean(Release release) {
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder()
				.build();
		mapperFactory.classMap(EnvironmentBean.class, Environment.class)
				.field("id", "id").field("name", "name")
				.field("version", "version").field("material", "material")
				.field("date", "date").field("jiraUrl", "jiraUrl")
				.field("jenkinsUrl", "jenkinsUrl").register();
		MapperFacade mapper = mapperFactory.getMapperFacade();
		return mapper.map(release, ReleaseBean.class);
	}

	public Release toEntity(ReleaseBean releaseBean) {
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder()
				.build();
		mapperFactory.classMap(Release.class, ReleaseBean.class).register();

		MapperFacade mapper = mapperFactory.getMapperFacade();
		return mapper.map(releaseBean, Release.class);
	}

}
