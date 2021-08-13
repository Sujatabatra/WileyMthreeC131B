package com.sujata.model.persistence;

import org.springframework.stereotype.Repository;

import com.sujata.model.database.UserDataBase;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public String getPassword(String username) {
		return UserDataBase.getUsers().get(username);
	}

}
