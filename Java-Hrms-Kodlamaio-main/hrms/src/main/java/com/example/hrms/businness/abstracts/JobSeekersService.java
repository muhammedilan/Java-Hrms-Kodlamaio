package com.example.hrms.businness.abstracts;

import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.entities.concretes.JobSeekers;

public interface JobSeekersService {
	public DataResult<JobSeekers> register(JobSeekers jobSeekers);
}
