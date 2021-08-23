package com.sujata.model.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sujata.bean.User;

@Repository
public interface UserDao extends JpaRepository<User, String>{

	@Query("FROM User WHERE username=:na and password=:pwd")
	public User getUser(@Param("na") String username,@Param("pwd") String password);
}
