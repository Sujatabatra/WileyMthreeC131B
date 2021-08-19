package com.sujata.persistence;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Trainer;

@Repository
@Transactional
public interface TrainerDao extends JpaRepository<Trainer, String> {

}
