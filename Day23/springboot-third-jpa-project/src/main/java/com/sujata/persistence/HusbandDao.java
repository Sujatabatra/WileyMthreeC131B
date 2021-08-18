package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sujata.bean.Husband;

public interface HusbandDao extends JpaRepository<Husband, String> {

}
