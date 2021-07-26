package com.sujata.training;

public class BussinessMan extends Person {

	private String natureOfBussiness;
	private int annualTurnover;
	
	BussinessMan(){
		
	}

	public BussinessMan(int id, String name, String natureOfBussiness, int annualTurnover) {
		super(id, name);
		this.natureOfBussiness = natureOfBussiness;
		this.annualTurnover = annualTurnover;
	}



	public String getNatureOfBussiness() {
		return natureOfBussiness;
	}

	public void setNatureOfBussiness(String natureOfBussiness) {
		this.natureOfBussiness = natureOfBussiness;
	}

	public int getAnnualTurnover() {
		return annualTurnover;
	}

	public void setAnnualTurnover(int annualTurnover) {
		this.annualTurnover = annualTurnover;
	}
	
}
