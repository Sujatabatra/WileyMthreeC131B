package com.sujata.demo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private int personId;
	private String personName;
	transient private int personAge;
	transient private Address addr;
	
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Person() {
		
	}
	
	public Person(int personId, String personName,int personAge) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge=personAge;
	}
	
	
	
	public Person(int personId, String personName) {
		super();
		this.personId = personId;
		this.personName = personName;
	}

	public Person(int personId) {
		super();
		this.personId = personId;
	}

	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge + "]";
	}
	
	
	private void writeObject(ObjectOutputStream ous) throws IOException,
	   ClassNotFoundException {
	 
	   ous.defaultWriteObject();
	   ous.writeObject(addr.gethNo());
	   ous.writeObject(addr.getStreet());
	   ous.writeObject(addr.getCity());
	   ous.writeObject(addr.getState());

	 }

	 private void readObject(ObjectInputStream ois) throws IOException,ClassNotFoundException {
	  try {
	   ois.defaultReadObject();
	   addr = new Address((int) ois.readObject(),
	     (String) ois.readObject(), (String) ois.readObject(),
	     (String) ois.readObject());
	   
	  } 
	  catch (Exception e) {

	   e.printStackTrace();
	  } 
	 }

}
