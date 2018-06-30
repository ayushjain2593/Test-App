package com.sse.grocery.service;

import java.util.List;

import com.sse.grocery.model.Category;
import com.sse.grocery.model.Content;

public interface CategoryService 
{
	List<Category> getActiveParentCategories();
	List<Content> getActiveCategories(List<String> ids);
	
	
	//List<Category> getCategories();
	//Category getCategory(String id);
	Category saveCategory(Category category);
	Category saveCategory(Category category, String parentCategoryId);
}