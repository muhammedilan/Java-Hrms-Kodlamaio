package com.example.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.businness.abstracts.JobSeekersService;
import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.entities.concretes.JobSeekers;

@RestController
@RequestMapping("/api/JobSeekers")
public class JobSeekersControllers {

	private JobSeekersService jobSeekersService;

	@Autowired
	public JobSeekersControllers(JobSeekersService jobSeekersService) {
		super();
		this.jobSeekersService = jobSeekersService;
	}
	@PostMapping("/register")
	public DataResult<JobSeekers> register(@RequestBody JobSeekers jobSeekers) {
		return this.jobSeekersService.register(jobSeekers);
	}
}
