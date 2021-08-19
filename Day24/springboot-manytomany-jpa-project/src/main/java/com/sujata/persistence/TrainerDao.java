package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sujata.bean.Trainer;

public interface TrainerDao extends JpaRepository<Trainer, String> {

}
