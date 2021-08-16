package com.sujata.model.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sujata.bean.User;
import com.sujata.helper.UserRowMapper;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public User getUser(User user) {
		try {
		return jdbcTemplate.queryForObject("SELECT * FROM MYUSER WHERE USERNAME=? and PWD=?", new UserRowMapper(), user.getUsername(),user.getPassword());
	
		}
		catch(EmptyResultDataAccessException ex) {
			return null;
		}
	}

}
