package com.sse.grocery.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.sse.grocery.model.Offer;

public interface OfferRepository extends MongoRepository<Offer, String>
{
	List<Offer> findOffersByActive(boolean isActive);
	@Query("{_id: { $in: ?0 },active: ?1 })")
	List<Offer> findOffersByIdsAndActive(List<String> ids, Boolean isActive);
}
