package com.sse.grocery.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.sse.grocery.model.Brand;
import com.sse.grocery.model.Content;

public interface BrandRepository extends MongoRepository<Brand, String>
{
	List<Brand> findBrandByActive(Boolean isActive);
	@Query("{_id: { $in: ?0 },active: ?1 })")
	List<Content> findBrandsByIdsAndActive(List<String> ids, Boolean isActive);
	List<Content> findBrandsByActiveOrderByNameAsc(Boolean isActive);
}
