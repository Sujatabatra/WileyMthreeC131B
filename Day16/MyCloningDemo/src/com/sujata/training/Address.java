package com.sujata.training;

public class Address implements Cloneable{

	private int hNo;
	private String streetName;
	private String city;
	private String state;
	private String pinCode;
	
	public Address() {
		
	}

	public Address(int hNo, String streetName, String city, String state, String pinCode) {
		super();
		this.hNo = hNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	public int gethNo() {
		return hNo;
	}

	public void sethNo(int hNo) {
		this.hNo = hNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", streetName=" + streetName + ", city=" + city + ", state=" + state
				+ ", pinCode=" + pinCode + "]";
	}
	
	public Address clone()throws CloneNotSupportedException{
		return (Address)super.clone();
	}
}
