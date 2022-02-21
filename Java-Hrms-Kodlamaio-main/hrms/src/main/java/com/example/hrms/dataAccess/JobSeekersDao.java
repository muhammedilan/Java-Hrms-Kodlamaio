package com.example.hrms.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.JobSeekers;

public interface JobSeekersDao extends JpaRepository<JobSeekers,Integer> {

}
