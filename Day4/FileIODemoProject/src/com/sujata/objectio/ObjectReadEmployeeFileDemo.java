package com.sujata.objectio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadEmployeeFileDemo {

	public static void main(String[] args) {
		
		try(FileInputStream fis=new FileInputStream("EmployeeDetails");
				ObjectInputStream ois=new ObjectInputStream(fis);){
			
			Employee emp=(Employee)ois.readObject();
			System.out.println(emp);
//			System.out.println(person.getPersonId()+" "+person.getPersonName());
			
		} catch (IOException|ClassNotFoundException e) {
			e.printStackTrace();
		} 

	}

}
