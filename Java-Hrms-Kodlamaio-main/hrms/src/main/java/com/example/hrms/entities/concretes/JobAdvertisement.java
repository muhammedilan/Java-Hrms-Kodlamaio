package com.example.hrms.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name="JobAdvertisement")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="description")
	private String description;
	
	@Column(name="minsalary")
	private int minsalary;
	
	@Column(name="maxsalary")
	private int maxsalary;
	
	@Column(name="openPosition")
	private int openPosition;
	
	@Column(name="releasedatetime")
	private LocalDateTime releasedatetime = LocalDateTime.now();
	
	@Column(name="active")
	private boolean active;
}
