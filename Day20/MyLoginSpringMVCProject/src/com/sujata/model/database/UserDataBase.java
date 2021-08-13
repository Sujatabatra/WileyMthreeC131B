package com.sujata.model.database;

import java.util.HashMap;

public class UserDataBase {

	private static HashMap<String, String> users=new HashMap();
	static {
		users.put("Sujata", "Batra");
		users.put("admin", "pass");
		users.put("scott", "tiger");
	}
	public static HashMap<String, String> getUsers() {
		return users;
	}
	public static void setUsers(HashMap<String, String> users) {
		UserDataBase.users = users;
	}
	
	
}
