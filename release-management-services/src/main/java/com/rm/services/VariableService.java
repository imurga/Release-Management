package com.rm.services;

import com.rm.beans.VariablesBean;
import com.rm.dao.entity.Variable;

public interface VariableService {

	public VariablesBean save(Variable variable);
}
