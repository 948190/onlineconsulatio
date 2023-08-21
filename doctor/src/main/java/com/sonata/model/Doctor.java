package com.sonata.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	@Id
	@GeneratedValue
	private int did;
	private String name;
	private String specialization;
	private String mobile;
	private String userName;
	private String password;
	
	public Doctor() {}

	public Doctor(int did, String name, String specialization, String mobile, String userName, String password) {
		super();
		this.did = did;
		this.name = name;
		this.specialization = specialization;
		this.mobile = mobile;
		this.userName = userName;
		this.password = password;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
