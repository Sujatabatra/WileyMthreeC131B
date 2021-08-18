package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Husband {

	@Id
	private String hId;
	private String hName;
	
	public Husband() {
		
	}

	public Husband(String hId, String hName) {
		super();
		this.hId = hId;
		this.hName = hName;
	}

	public String gethId() {
		return hId;
	}

	public void sethId(String hId) {
		this.hId = hId;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}
	
	
}
