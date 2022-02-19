package com.example.hrms.businness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.businness.abstracts.EmployersService;
import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.core.utilities.result.ErrorDataResult;

import com.example.hrms.core.utilities.result.SuccessDataResult;
import com.example.hrms.dataAccess.EmployersDao;
import com.example.hrms.entities.concretes.Employers;

@Service
public class EmployersManager implements EmployersService {

	private EmployersDao employersDao;
	
	@Autowired
	public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}

	@Override
	public DataResult<Employers> register(Employers employers) {
		if(employers.isEmailverification() == false || employers.isHrmsverification() == false) {
			return new ErrorDataResult<Employers>(null, "Doğrulamalar başarısız..");
		}
		return new SuccessDataResult<Employers>(this.employersDao.save(employers), "Kaydedildiniz");
	}

	@Override
	public DataResult<List<Employers>> getAll() {
		return new SuccessDataResult<List<Employers>>(this.employersDao.findAll(), "İş Verenler Listelendi");
	}

	@Override
	public DataResult<Employers> add(Employers employers) {
		return new SuccessDataResult<Employers>(this.employersDao.save(employers),"İş İlanı eklenmiştir");
	}


}
