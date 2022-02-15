package com.example.hrms.businness.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.entities.concretes.Employers;

public interface EmployersService {
	public DataResult<Employers> register(Employers employers);
	public DataResult<List<Employers>> getAll();
}
