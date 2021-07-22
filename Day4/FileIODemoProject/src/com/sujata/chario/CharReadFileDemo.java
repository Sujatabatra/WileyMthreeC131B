package com.sujata.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharReadFileDemo {

	public static void main(String[] args) {
		try(FileReader fr=new FileReader("CharFile");){
			int ch;
			while((ch=fr.read())!=-1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
