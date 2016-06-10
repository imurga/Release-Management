package com.rm.beans;

import com.rm.dao.entity.Release;
import com.rm.dao.entity.Variable;

public class EnvironmentBean {

	private Integer id;
	
	private String name;

	private String description;

	private boolean enable;

	private Release release;
	
	private Variable variable1;
	
	private Variable variable2;
	
	private Variable variable3;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
