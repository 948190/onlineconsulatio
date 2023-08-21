package com.sonata.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonata.model.Consultation;
import com.sonata.model.Status;

public interface ConsultaionRepository extends JpaRepository<Consultation,Integer>{

	List<Consultation> findByDate(LocalDate date);
	List<Consultation> findByStatus(Status s);
	List<Consultation> findAllByDid(int did);
	Consultation findByDidAndPid(int did, int pid);
	
	
}
