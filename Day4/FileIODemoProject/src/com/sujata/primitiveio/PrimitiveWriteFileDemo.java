package com.sujata.primitiveio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.io.DataOutputStream;

public class PrimitiveWriteFileDemo {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		DataOutputStream oos=null;
		try {
			fos=new FileOutputStream("PrimitiveIO");
			oos=new DataOutputStream(fos);
			
			oos.writeBoolean(true);
			oos.writeDouble(75.6);
			oos.writeInt(120);
			
			System.out.println("File Created ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}

	}

}
