package com.example.hrms.businness.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.entities.concretes.GeneralJobPosition;

public interface GeneralJobPositionService {
	public DataResult<List<GeneralJobPosition>> getAll();
	public DataResult<GeneralJobPosition> add(GeneralJobPosition generalJobPosition);
}
