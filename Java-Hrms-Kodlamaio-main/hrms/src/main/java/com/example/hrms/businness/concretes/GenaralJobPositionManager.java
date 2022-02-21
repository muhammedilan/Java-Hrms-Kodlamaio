package com.example.hrms.businness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.businness.abstracts.GeneralJobPositionService;
import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.core.utilities.result.SuccessDataResult;
import com.example.hrms.dataAccess.GeneralJobPositionDao;
import com.example.hrms.entities.concretes.GeneralJobPosition;

@Service
public class GenaralJobPositionManager implements GeneralJobPositionService {

	private GeneralJobPositionDao generalJobPositionDao;
	
	@Autowired
	public GenaralJobPositionManager(GeneralJobPositionDao generalJobPositionDao) {
		super();
		this.generalJobPositionDao = generalJobPositionDao;
	}


	@Override
	public DataResult<List<GeneralJobPosition>> getAll() {
		return new SuccessDataResult<List<GeneralJobPosition>>
		(this.generalJobPositionDao.findAll(),"Bütün Genel iş pozisyonu listesi: ");
	}


	@Override
	public DataResult<GeneralJobPosition> add(GeneralJobPosition generalJobPosition) {
		return new SuccessDataResult<GeneralJobPosition>
		(this.generalJobPositionDao.save(generalJobPosition), "Genel iş pozisyonu eklendi");
	}


}
