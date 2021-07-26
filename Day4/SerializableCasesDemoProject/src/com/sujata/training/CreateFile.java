package com.sujata.training;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CreateFile {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("MyData");
			oos=new ObjectOutputStream(fos);
			Employee emp=new Employee(111,"AAA","Sales","Executive",78900);
		
			oos.writeObject(emp);
			System.out.println("File Created");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
		}

	}

}
