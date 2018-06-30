package com.sse.grocery.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sse.grocery.model.Category;
import com.sse.grocery.model.Content;
import com.sse.grocery.repository.CategoryRepository;
import com.sse.grocery.utility.ListUtils;

@Service
public class CategoryServiceImpl implements CategoryService 
{
	@Autowired
	CategoryRepository repo;
	
	@Override
	public List<Category> getActiveParentCategories()
	{
		List<Category> categList = repo.findCategoryByActiveAndParent(true, true);
		if(ListUtils.hasElements(categList))
			removeInactiveSubCategory(categList);
		return categList ;
	}
	
	@Override
	public List<Content> getActiveCategories(List<String> ids)
	{
		List<Content> categList = repo.findCategoriesByIdsAndActive(ids, true);
		if(ListUtils.hasElements(categList)) 
		{
			for (Content category : categList)						//to leave only single level category hierarchy
				((Category)category).setSubCategory(null);
		}
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
			//else if((category.getSubCategory() != null) && (!category.getSubCategory().isEmpty()))
			else if(ListUtils.hasElements(category.getSubCategory()))
				removeInactiveSubCategory(category.getSubCategory());
		}
	}
	
	
	
	
	
	/*@Override
	public List<Category> getActiveCategories()
	{
		return repo.findAll();
	}

	@Override
	public Category getActiveCategory(String id)
	{
		return repo.findOne(id);
	}*/
	
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
		if(parentCategory != null)
		{
			category.setId(null);
			category.setParent(false);
			saveCategory(category);
			parentCategory.getSubCategory().add(category);
			repo.save(parentCategory);
		}
		return category;
	}
}
