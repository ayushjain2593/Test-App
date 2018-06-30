package com.sse.grocery.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sse.grocery.model.Block;
import com.sse.grocery.model.enums.Page;

public interface BlockRepository extends MongoRepository<Block, String> 
{
	//List<Block> findBlocksByActiveOrderByBlockNoAsc(boolean isActive);
	List<Block> findBlocksByPageOrderByBlockNoAsc(Page page);
}
