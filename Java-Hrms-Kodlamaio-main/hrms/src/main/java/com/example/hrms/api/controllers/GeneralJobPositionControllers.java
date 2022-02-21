package com.example.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.businness.abstracts.GeneralJobPositionService;
import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.entities.concretes.GeneralJobPosition;


@RestController
@RequestMapping("/api/GeneralJobPosition")
public class GeneralJobPositionControllers {

	private GeneralJobPositionService generalJobPositionService;

	@Autowired
	public GeneralJobPositionControllers(GeneralJobPositionService generalJobPositionService) {
		super();
		this.generalJobPositionService = generalJobPositionService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<GeneralJobPosition>> getAll() {
		return this.generalJobPositionService.getAll();
	}
	
	@PostMapping("/add")
	public DataResult<GeneralJobPosition> add(@RequestBody GeneralJobPosition generalJobPosition) {
		return this.generalJobPositionService.add(generalJobPosition);
	}
}
