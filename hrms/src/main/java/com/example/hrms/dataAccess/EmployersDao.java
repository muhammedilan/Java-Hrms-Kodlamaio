package com.example.hrms.dataAccess;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.Employers;

public interface EmployersDao extends JpaRepository<Employers,Integer> {

}
