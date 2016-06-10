package com.rm.dao.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "environment")
public class Environment {

	@Id
	private Integer id;
	
	private String name;

	private String description;

	private boolean enable;

	@DBRef(db = "release")
	private Release release = new Release();
	
	@DBRef(db = "variable")
	private Variable variable1 = new Variable();
	
	@DBRef(db = "variable")
	private Variable variable2 = new Variable();
	
	@DBRef(db = "variable")
	private Variable variable3 = new Variable();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public Release getReleases() {
		return release;
	}

	public void setReleases(Release release) {
		this.release = release;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Release getRelease() {
		return release;
	}

	public void setRelease(Release release) {
		this.release = release;
	}

	public Variable getVariable1() {
		return variable1;
	}

	public void setVariable1(Variable variable1) {
		this.variable1 = variable1;
	}

	public Variable getVariable2() {
		return variable2;
	}

	public void setVariable2(Variable variable2) {
		this.variable2 = variable2;
	}

	public Variable getVariable3() {
		return variable3;
	}

	public void setVariable3(Variable variable3) {
		this.variable3 = variable3;
	}

}
