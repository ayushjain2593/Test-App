package com.sse.grocery.service;

import java.util.List;

import com.sse.grocery.model.Block;

public interface BlockService 
{
	List<Block> getHomeBlockList();
	Block saveBlock(Block block);

}
