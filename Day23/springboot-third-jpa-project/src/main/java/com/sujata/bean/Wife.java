package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Wife {

	@Id
	private int wId;
	private String wName;
	@OneToOne
	private Husband husband;
	
	public Wife() {
		
	}
	public Wife(int wId, String wName) {
		super();
		this.wId = wId;
		this.wName = wName;
	}
	public int getwId() {
		return wId;
	}
	public void setwId(int wId) {
		this.wId = wId;
	}
	public String getwName() {
		return wName;
	}
	public void setwName(String wName) {
		this.wName = wName;
	}
	public Husband getHusband() {
		return husband;
	}
	public void setHusband(Husband husband) {
		this.husband = husband;
	}
	
	
}
