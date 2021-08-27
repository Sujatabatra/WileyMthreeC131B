package com.sujata.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.Blog;
import com.sujata.service.BlogService;

@RestController
public class BlogResource {

	@Autowired
	private BlogService blogService;
	
	@CrossOrigin
	@GetMapping("/blogs")
	public List<Blog> getAllBlogs(){
		return blogService.getAllBlogs();
	}
}
