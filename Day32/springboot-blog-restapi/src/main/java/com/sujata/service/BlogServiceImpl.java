package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sujata.bean.Blog;
import com.sujata.persistence.BlogDao;

@Service
@Transactional
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogDao blogDao;
	
	@Override
	public List<Blog> getAllBlogs() {
		return blogDao.findAll();
	}

	@Override
	public Blog getBlogById(int id) {
		return blogDao.getById(id);
		
	}
	@Override
	public boolean deleteBlogById(int id) {
		blogDao.deleteById(id);
		return true;
	}
	
	@Override
	public Blog addBlog(Blog blog) {
		return blogDao.save(blog);
	}

}
