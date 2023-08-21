package com.sonata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonata.model.Consultation;
import com.sonata.model.Status;

@Service
public class ConsultationService implements ConsultationIntf{
	
	@Autowired
	ConsultaionRepository cr;

	@Override
	public Consultation post(Consultation c) {
		return cr.save(c);
	}
	
	@Override
	public Consultation put(Consultation c,int pid,int did){
		Consultation c1=cr.findByDidAndPid(did, pid);
		c1.setDate(c.getDate());
		c1.setTime(c.getTime());
		c1.setStatus(c.getStatus());
		c1.setRid(c.getRid());
		c1.setPrescription(c.getPrescription());
		return cr.save(c1);
	}

	@Override
	public List<Consultation> get() {
		return cr.findByStatus(Status.Available);
	}

	@Override
	public Consultation getSlots(int pid, int did) {
		return cr.findByDidAndPid(did,pid);
	}

	@Override
	public List<Consultation> getDoctorSlots(int did) {
		// TODO Auto-generated method stub
		return cr.findAllByDid(did).stream().filter(con-> con.getStatus()!=Status.Available).toList();
	}
	
	
	
	



}
