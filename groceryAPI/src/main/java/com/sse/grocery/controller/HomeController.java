package com.sse.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sse.grocery.model.Block;
import com.sse.grocery.service.BlockService;

@RestController
@RequestMapping("/")
public class HomeController 
{
	@Autowired
	private BlockService blockService;
	
	@GetMapping
	public List<Block> getHomeBlocks()
	{
		return blockService.getHomeBlockList();
	}
	
	@PostMapping
	public Block saveBlock(@RequestBody Block block)
	{
		return blockService.saveBlock(block);
	}

}
