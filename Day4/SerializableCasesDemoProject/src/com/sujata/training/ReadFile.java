package com.sujata.training;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadFile {

	public static void main(String[] args) {
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("MyData");
			ois=new ObjectInputStream(fis);
			
			Employee emp=(Employee)ois.readObject();
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getDepartment()+
					" "+emp.getDesignation()+" "+emp.getSalary());
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}


	}

}
