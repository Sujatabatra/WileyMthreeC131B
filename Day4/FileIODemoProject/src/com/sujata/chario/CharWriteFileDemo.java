package com.sujata.chario;

import java.io.FileWriter;
import java.io.IOException;

public class CharWriteFileDemo {

	public static void main(String[] args) {
		
		try(FileWriter fw=new FileWriter("CharFile");){
			String str="Demonstrating Char Input Output";
			fw.write(str);
			System.out.println("File Created");
		} catch (IOException e) {
			e.printStackTrace();
		}
				

	}

}
