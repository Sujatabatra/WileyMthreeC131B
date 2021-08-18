package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sujata.bean.Wife;

public interface WifeDao extends JpaRepository<Wife, Integer> {

}
