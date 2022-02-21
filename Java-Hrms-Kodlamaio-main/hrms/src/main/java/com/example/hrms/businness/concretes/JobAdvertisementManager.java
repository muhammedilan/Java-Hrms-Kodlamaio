package com.example.hrms.businness.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.hrms.businness.abstracts.JobAdvertisementService;
import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.core.utilities.result.SuccessDataResult;
import com.example.hrms.dataAccess.JobAdvertisementDao;
import com.example.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllIsActive() {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByactiveTrue(), "asd");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllDate() {
		Sort sort = Sort.by(Sort.Direction.DESC,"releasedatetime");
		
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.findAll(sort),"Bütün bilgiler yeniden eskiye doğru getirildi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllCompanyName(String companyName) {
		return new SuccessDataResult<List<JobAdvertisement>>
		(this.jobAdvertisementDao.getBycompanyNameContains(companyName), "Şirket adına göre veri geldi");
	}

}
