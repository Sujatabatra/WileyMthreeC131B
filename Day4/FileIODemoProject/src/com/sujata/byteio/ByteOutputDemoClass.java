package com.sujata.byteio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteOutputDemoClass {

	public static void main(String[] args) {
//		FileOutputStream fos=null;
		//Automatic Resource Deallocation : JDK1.7
		try (FileOutputStream fos=new FileOutputStream("ByteInputOutput");){
			
//			fos=new FileOutputStream("ByteInputOutput");
			
			byte[] arr= {'S','U','J','A','T','A','\n','B','A','T','R','A','\n','D','E','L','H','I'};
			
			fos.write(arr);
			
			System.out.println("File created!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		finally {
//			try {
//				fos.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

	}

}
