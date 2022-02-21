package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name="JobSeekers")
public class JobSeekers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;

	@Column(name="tcno")
	private String tcno;
	
	@Column(name="birthday")
	private String birthday;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="passwordrepeat")
	private String passwordrepeat;
	
	@Column(name="mernisverification")
	private boolean mernisverification;
	
	@Column(name="emailverification")
	private boolean emailverification;
	
	
}
