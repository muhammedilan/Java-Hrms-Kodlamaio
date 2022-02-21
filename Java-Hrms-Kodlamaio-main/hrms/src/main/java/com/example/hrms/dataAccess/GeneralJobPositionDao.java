package com.example.hrms.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.GeneralJobPosition;

public interface GeneralJobPositionDao extends JpaRepository<GeneralJobPosition,Integer> {

}
