package com.sujata.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.model.bean.User;
import com.sujata.model.persistence.UserDao;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean loginCheck(User user) {
		String password=userDao.getPassword(user.getUsername());
		if(password!=null)
			return password.equals(user.getPassword());
		return false;
	}

}
