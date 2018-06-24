package com.sse.grocery.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.sse.grocery.model.Category;

public interface CategoryRepository extends MongoRepository<Category, String>
{
	@Query("{_id: { $in: ?0 },active: ?1 })")
	List<Category> findCategoriesByIdsAndActive(List<String> ids, Boolean isActive);
	
	List<Category> findCategoryByActiveAndParent(Boolean isactive, Boolean isParent);
}