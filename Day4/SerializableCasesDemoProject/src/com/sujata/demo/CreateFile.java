package com.sujata.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CreateFile {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("ObjectIODemoFile");
			oos=new ObjectOutputStream(fos);
			Person p=new Person(101, "AAAAA",45);
			p.setAddr(new Address(101, "Street 1", "City 1", "state 1"));
			oos.writeObject(p);
			
			
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
			
			System.out.println("File Created");
		}

	}

}
