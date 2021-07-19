package com.sujata.demo;

public class MainAccount {

	public static void main(String[] args) {
		Account a001=new Account();
		Account a002=new Account();
		Thread orijit=new Thread(a001, "Orijit");
		Thread muskan=new Thread(a002,"Muskan");
		
		orijit.start();
		muskan.start();
	}

}
