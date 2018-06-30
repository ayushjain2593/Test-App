package com.sse.grocery.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.sse.grocery.model.Content;
import com.sse.grocery.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>
{
	@Query("{_id: { $in: ?0 },active: ?1 }")
	List<Content> findProductsByIdsAndActive(List<String> ids, Boolean isActive);
	
	//@Query("{category: ?0 ,active: ?1 }")
	List<Product> findProductsByCategoryAndActive(String id, Boolean isActive);
	List<Product> findProductsByBrandAndActive(String id, Boolean isActive);
	//@Query("{offer: ?0 ,active: ?1 }")
	List<Product> findProductsByOfferAndActive(String id, Boolean isActive);
	Product findProductByIdAndActive(String id, Boolean isActive);
	//Page<Product> findProductsByCategoryInAndActive(List<String> id, Boolean isActive, Pageable pageable);
	
	/*@Query("{category: { $in: ?0 } ,active: ?1 },{$limit: ?2}")
	List<Product> findProductsByCategoryAndActive(List<String> id, Boolean isActive, int count);
	@Query("{category: ?0 ,active: ?1 },{$limit: ?2}")
	List<Product> findProductsByBrandAndActive(String id, Boolean isActive, int count);*/
}
