package com.sujata.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@CrossOrigin
	@GetMapping("/blogs/{id}")
	public Blog getBlogsById(@PathVariable("id") int id){
		return blogService.getBlogById(id);
	}
	
	@CrossOrigin
	@PostMapping("/blogs")
	public Blog getBlogsById(@RequestBody Blog blog){
		
		return blogService.addBlog(blog);
	}
	
	@CrossOrigin
	@DeleteMapping("/blogs/{id}")
	public boolean deleteBlogById(@PathVariable("id") int id){
		return blogService.deleteBlogById(id);
	}
	
}
