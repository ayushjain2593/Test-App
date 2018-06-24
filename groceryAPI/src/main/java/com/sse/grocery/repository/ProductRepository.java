package com.sse.grocery.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.sse.grocery.model.Product;

public interface ProductRepository extends MongoRepository<Product, String>
{
	//@Query("{category: ?0 ,active: ?1 })")
	List<Product> findProductsByCategoryAndActive(String id, Boolean isActive);
	List<Product> findProductsByBrandAndActive(String id, Boolean isActive);
	//@Query("{offer: ?0 ,active: ?1 })")
	List<Product> findProductsByOfferAndActive(String id, Boolean isActive);
	Product findProductByIdAndActive(String id, Boolean isActive);
	@Query("{_id: { $in: ?0 },active: ?1 })")
	List<Product> findProductsByIdsAndActive(List<String> ids, Boolean isActive);

}
