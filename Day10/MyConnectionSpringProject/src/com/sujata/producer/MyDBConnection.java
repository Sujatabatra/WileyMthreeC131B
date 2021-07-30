package com.sujata.producer;

public class MyDBConnection {

	private String driverName, url, username, password;

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void createConnection() {
		System.out.println("Establishing the connection with ");
		System.out.println("Driver Name " + driverName);
		System.out.println("URL : " + url);
		System.out.println("username of db : " + username);
		System.out.println("password of db : " + password);
	}
}
