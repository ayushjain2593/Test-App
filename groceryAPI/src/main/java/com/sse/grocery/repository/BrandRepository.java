package com.sse.grocery.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.sse.grocery.model.Brand;
import com.sse.grocery.model.Content;

public interface BrandRepository extends MongoRepository<Brand, String>
{
	@Query("{_id: { $in: ?0 },active: ?1 })")
	List<Content> findBrandsByIdsAndActive(List<String> ids, Boolean isActive);
	List<Brand> findBrandsByActiveOrderByNameAsc(Boolean isActive);
}
