package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sujata.bean.Learner;

public interface LearnerDao extends JpaRepository<Learner, String> {

}
