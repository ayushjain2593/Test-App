package com.sse.grocery.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sse.grocery.model.Block;

public interface BlockRepository extends MongoRepository<Block, String> 
{
	List<Block> findBlocksByActiveOrderByBlockNoAsc(boolean isActive);
}
