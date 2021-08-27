package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Blog;
import com.sujata.persistence.BlogDao;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogDao blogDao;
	
	@Override
	public List<Blog> getAllBlogs() {
		return blogDao.findAll();
	}

}
