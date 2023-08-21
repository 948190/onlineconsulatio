package com.sonata.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonata.model.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer>{
	
	List<Doctor> findBySpecialization(String specialization);

	List<Doctor> findByUserNameAndPassword(String userName, String password);

}
