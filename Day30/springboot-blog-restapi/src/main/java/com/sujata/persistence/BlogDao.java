package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sujata.bean.Blog;

@Repository
public interface BlogDao extends JpaRepository<Blog, Integer> {

}
