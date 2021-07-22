package com.sujata.byteio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteInputDemoClass {

	public static void main(String[] args) {
		
		try(FileInputStream fis=new FileInputStream("ByteInputOutput");){
			int ch;
			while((ch=fis.read())!=-1) {
				System.out.print((char)ch);
			}
		}
		catch(FileNotFoundException ex) {
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
