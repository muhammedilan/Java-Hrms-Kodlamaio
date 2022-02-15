package com.example.hrms.businness.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.businness.abstracts.JobSeekersService;
import com.example.hrms.core.utilities.result.DataResult;
import com.example.hrms.core.utilities.result.ErrorDataResult;
import com.example.hrms.core.utilities.result.SuccessDataResult;
import com.example.hrms.dataAccess.JobSeekersDao;
import com.example.hrms.entities.concretes.JobSeekers;

@Service
public class JobSeekersManager implements JobSeekersService{

	private JobSeekersDao jobSeekersDao;
	
	@Autowired
	public JobSeekersManager(JobSeekersDao jobSeekersDao) {
		super();
		this.jobSeekersDao = jobSeekersDao;
	}

	@Override
	public DataResult<JobSeekers> register(JobSeekers jobSeekers) {
		if(jobSeekers.isEmailverification() == false && jobSeekers.isMernisverification() == false) {
			return new ErrorDataResult<JobSeekers>(null,"Hem mernis hem de email doğrulanmadı");
		}
		if(jobSeekers.isEmailverification() == false) {
			return new ErrorDataResult<JobSeekers>(null, "Email doğrulanmadı");
		}
		if(jobSeekers.isMernisverification() == false) {
			return new ErrorDataResult<JobSeekers>(null, "Mernis Doğrulanmadı");
		}
		return new SuccessDataResult<JobSeekers>(this.jobSeekersDao.save(jobSeekers),"İş Arayan Kaydoldu");
	}

}
