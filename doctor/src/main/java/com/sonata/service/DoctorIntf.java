package com.sonata.service;

import java.util.List;

import com.sonata.model.Doctor;

public interface DoctorIntf {
	
	public List<Doctor> getDocSpecial(String special);
	public List<Doctor> getDoctors();
	public int login(String userName, String password);
	public Doctor getDoctor(int id);
	

}
