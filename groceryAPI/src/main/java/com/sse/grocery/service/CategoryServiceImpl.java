package com.sse.grocery.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sse.grocery.model.Category;
import com.sse.grocery.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService 
{
	@Autowired
	CategoryRepository repo;
	
	@Override
	public List<Category> getActiveParentCategories()
	{
		List<Category> categList = repo.findCategoryByActiveAndParent(true, true);
		removeInactiveSubCategory(categList);
		return categList ;
	}
	
	@Override
	public List<Category> getActiveCategories(List<String> ids)
	{
		List<Category> categList = repo.findCategoriesByIdsAndActive(ids, true);
		
		/*to leave only single level category hierarchy*/
		for (Category category : categList)
			category.setSubCategory(null);
		return categList;
	}
	
	public void removeInactiveSubCategory(List<Category> categoryList)
	{
		Category category;
		ListIterator<Category> iter = categoryList.listIterator();
		while(iter.hasNext())
		{
			category = iter.next();
			if(!category.isActive())
				iter.remove();
			else if((category.getSubCategory() != null) && (!category.getSubCategory().isEmpty()))
				removeInactiveSubCategory(category.getSubCategory());
		}
	}
	
	
	
	
	
	@Override
	public List<Category> getCategories()
	{
		return repo.findAll();
	}

	@Override
	public Category getCategory(String id)
	{
		return repo.findOne(id);
	}
	
	@Override
	public Category saveCategory(Category category) 
	{
		category.setSubCategory(new ArrayList<Category>());
		category.setId(null);
		category.setParent(true);
		return repo.save(category);
	}
	
	@Override
	public Category saveCategory(Category category, String parentCategoryId) 
	{
		Category parentCategory = repo.findOne(parentCategoryId);
		category.setId(null);
		category.setParent(false);
		saveCategory(category);
		parentCategory.getSubCategory().add(category);
		repo.save(parentCategory);
		return category;
	}
}
