package com.sonata.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Consultation {
	
	@Id
	@GeneratedValue
	private int cid;
	private int did;
	private int pid;
	private LocalDate date;
	private LocalTime time;
	private Status status;
	private String prescription;
	private int rid;
	

	public Consultation() {}


	public Consultation(int cid,int pid, int did, LocalDate date, LocalTime time, Status status, String prescription, int rid) {
		super();
		this.cid=cid;
		this.pid = pid;
		this.did = did;
		this.date = date;
		this.time = time;
		this.status = status;
		this.prescription = prescription;
		this.rid = rid;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public int getDid() {
		return did;
	}


	public void setDid(int did) {
		this.did = did;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public LocalTime getTime() {
		return time;
	}


	public void setTime(LocalTime time) {
		this.time = time;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public String getPrescription() {
		return prescription;
	}


	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}


	public int getRid() {
		return rid;
	}


	public void setRid(int rid) {
		this.rid = rid;
	}




	
	
	
	
	

	  
	

}
