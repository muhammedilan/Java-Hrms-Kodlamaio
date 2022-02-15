package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.businness.abstracts.EmployersService;
import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.entities.concretes.Employers;

@RestController
@RequestMapping("/api/Employers")
public class EmployersControllers {

	private EmployersService employersService;

	@Autowired
	public EmployersControllers(EmployersService employersService) {
		super();
		this.employersService = employersService;
	}
	
	@PostMapping("/register")
	public DataResult<Employers> register(@RequestBody Employers employers) {
		return this.employersService.register(employers);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Employers>> getAll() {
		return this.employersService.getAll();
	}
	


}
