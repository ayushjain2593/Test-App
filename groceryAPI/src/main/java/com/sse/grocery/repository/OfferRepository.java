package com.sse.grocery.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.sse.grocery.model.Content;
import com.sse.grocery.model.Offer;

public interface OfferRepository extends MongoRepository<Offer, String>
{
	@Query("{_id: { $in: ?0 },active: ?1 })")
	List<Content> findOffersByIdsAndActive(List<String> ids, Boolean isActive);
	//List<Offer> findOffersByActive(boolean isActive);
	
}
