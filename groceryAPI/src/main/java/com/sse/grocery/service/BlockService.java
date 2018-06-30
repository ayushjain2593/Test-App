package com.sse.grocery.service;

import java.util.List;

import com.sse.grocery.model.Block;
import com.sse.grocery.model.enums.Page;

public interface BlockService 
{
	List<Block> getActiveBlockList(Page page);
	Block saveBlock(Block block);

}
