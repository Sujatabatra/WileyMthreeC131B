package com.sujata.objectio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteEmployeeFileDemo {

	public static void main(String[] args) {
		
		try(FileOutputStream fos=new FileOutputStream("EmployeeDetails");
				ObjectOutputStream oos=new ObjectOutputStream(fos);){

			Employee employee =new Employee(1, "AAA", "Associate", "IT", 35000);
			oos.writeObject(employee);
			System.out.println("File Created");
			
	} catch (IOException|NullPointerException e) {
		e.printStackTrace();
	}
	}
		

}
