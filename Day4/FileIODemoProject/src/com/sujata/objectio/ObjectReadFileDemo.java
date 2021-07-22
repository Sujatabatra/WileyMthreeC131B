package com.sujata.objectio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadFileDemo {

	public static void main(String[] args) {
		
		try(FileInputStream fis=new FileInputStream("PersonDetails");
				ObjectInputStream ois=new ObjectInputStream(fis);){
			
			Person person=(Person)ois.readObject();
			
			System.out.println(person.getPersonId()+" "+person.getPersonName());
			
		} catch (IOException|ClassNotFoundException e) {
			e.printStackTrace();
		} 

	}

}
