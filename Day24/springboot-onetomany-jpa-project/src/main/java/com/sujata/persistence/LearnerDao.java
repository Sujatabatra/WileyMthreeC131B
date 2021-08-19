package com.sujata.persistence;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Learner;

@Repository
@Transactional
public interface LearnerDao extends JpaRepository<Learner, String> {

}
