package com.sonata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonata.model.Doctor;
@Service
public class DoctorService implements DoctorIntf {

	@Autowired
	DoctorRepo dr;
	
	@Override
	public List<Doctor> getDocSpecial(String special) {
	
		return dr.findBySpecialization(special);
	}

	@Override
	public List<Doctor> getDoctors() {
		
		return dr.findAll();
	}
	
	@Override
	public int login(String userName, String password) {
		int id=-1;
		if(dr.findByUserNameAndPassword(userName, password).isEmpty())
			id=dr.findByUserNameAndPassword(userName, password).get(0).getDid();
		return id;
	}
	
	@Override
	public Doctor getDoctor(int id) {
		// TODO Auto-generated method stub
		return dr.findById(id).get();
	}

}
