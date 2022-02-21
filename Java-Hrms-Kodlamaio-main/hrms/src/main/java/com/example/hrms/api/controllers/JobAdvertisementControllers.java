package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.businness.abstracts.JobAdvertisementService;
import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/JobAdvertisement")
public class JobAdvertisementControllers {
	public JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementControllers(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getAllIsActive")
	public DataResult<List<JobAdvertisement>> getAllIsActive() {
		return this.jobAdvertisementService.getAllIsActive();
	}
	
	@GetMapping("/getAllDate")
	public DataResult<List<JobAdvertisement>> getAllIsDate() {
		return this.jobAdvertisementService.getAllDate();
	}
	@PostMapping("/getAllCompany")
	public DataResult<List<JobAdvertisement>> getAllCompanyName(@RequestBody String companyName) {
		return this.jobAdvertisementService.getAllCompanyName(companyName);
	}


	
}
