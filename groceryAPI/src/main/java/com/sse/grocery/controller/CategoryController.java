package com.sse.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sse.grocery.model.Category;
import com.sse.grocery.service.CategoryService;

/**
 * @author Ayush Jain
 *
 */

@RestController
@RequestMapping("/category")
public class CategoryController 
{
	@Autowired
	CategoryService service;
	
	@GetMapping
	public List<Category> getActiveCategories()
	{
		return service.getActiveParentCategories();
	}	
	
	
	@GetMapping(value="/{ids}")
	public List<Category> getCategories(@PathVariable("ids") List<String> ids)
	{
		return service.getActiveCategories(ids);
	}
	
	
	/*
	 * Functions for admin pannel.
	 * 
	 */ 
	
	@GetMapping(value="/all")
	public List<Category> getCategories()
	{
		return service.getCategories();
	}
	
	@GetMapping(value="/single/{categoryId}")
	public Category getCategory(@PathVariable("categoryId") String categoryId)
	{
		Category category = service.getCategory(categoryId);
		return category;
	}
	
	@PostMapping
	public Category saveCategory(@RequestHeader(required=false) String parentCategoryId, @RequestBody Category category)
	{
		if(parentCategoryId != null)
			return service.saveCategory(category, parentCategoryId);
		else
			return service.saveCategory(category);
	}
	
	@PutMapping(value="/{categoryId}")
	public Category updateCategory(@PathVariable("categoryId") String categoryId, @RequestBody Category category)
	{
		//TODO to be analysed for updation such as changes, activation, deactivation, subcategory removal.
		return null;
	}
	
}