package com.example.hrms.businness.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	DataResult<List<JobAdvertisement>> getAllIsActive();
	DataResult<List<JobAdvertisement>> getAllDate();
	DataResult<List<JobAdvertisement>> getAllCompanyName(String companyName);
}
