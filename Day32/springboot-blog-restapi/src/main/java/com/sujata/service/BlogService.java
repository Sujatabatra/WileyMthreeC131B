package com.sujata.service;

import java.util.List;

import com.sujata.bean.Blog;

public interface BlogService {

	List<Blog> getAllBlogs();
	Blog getBlogById(int id);
	Blog addBlog(Blog blog);
	boolean deleteBlogById(int id);
}
