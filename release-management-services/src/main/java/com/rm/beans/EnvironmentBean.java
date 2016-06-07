package com.rm.beans;

import java.util.ArrayList;
import java.util.List;

public class EnvironmentBean {

	private long id;
	
	private String name;

	private String description;

	private boolean enable;

	private List<ReleaseBean> releases = new ArrayList<ReleaseBean>();
	
	private List<VariablesBean> variables = new ArrayList<VariablesBean>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public List<ReleaseBean> getReleases() {
		return releases;
	}

	public void setReleases(List<ReleaseBean> releases) {
		this.releases = releases;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<VariablesBean> getVariables() {
		return variables;
	}

	public void setVariables(List<VariablesBean> variables) {
		this.variables = variables;
	}

}
