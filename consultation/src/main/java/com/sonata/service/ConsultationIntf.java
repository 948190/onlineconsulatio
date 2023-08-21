package com.sonata.service;

import java.util.List;

import com.sonata.model.Consultation;

public interface ConsultationIntf {
	
	public Consultation post(Consultation c);
	
	public List<Consultation> get();

	public Consultation getSlots(int pid, int did);

	public List<Consultation> getDoctorSlots(int did);

	public Consultation put(Consultation c,int pid,int did);
	
	
	
	
	
	
	
	

}
