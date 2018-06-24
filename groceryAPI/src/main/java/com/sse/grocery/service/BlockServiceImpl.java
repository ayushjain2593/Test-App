package com.sse.grocery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sse.grocery.model.Block;
import com.sse.grocery.model.Content;
import com.sse.grocery.repository.BlockRepository;

@Service
public class BlockServiceImpl implements BlockService 
{
	@Autowired
	private BlockRepository blockRepo;
	@Autowired
	private CategoryService categService;
	@Autowired
	private BrandService brandService;
	@Autowired
	private ProductService productService;
	@Autowired
	private OfferService offerService;
	
	@Override
	public List<Block> getHomeBlockList()
	{
		List<Block> blockList = blockRepo.findBlocksByActiveOrderByBlockNoAsc(true);
		System.out.println(blockList);
		for (Block block : blockList) 
		{
			switch (block.getType()) {
			case 1:
				block.setContent((List<Content>)(List<?>)categService.getActiveCategories(block.getContentRef()));
				break;
			case 2:
				block.setContent((List<Content>)(List<?>)brandService.getActiveBrands(block.getContentRef()));
				break;
			case 3:
				block.setContent((List<Content>)(List<?>)offerService.getActiveOffers(block.getContentRef()));
				break;
			case 4:
				block.setContent((List<Content>)(List<?>)productService.getActiveProducts(block.getContentRef()));
				break;
			}
		}
		return blockList;
	}
	
	@Override
	public Block saveBlock(Block block)
	{
		return blockRepo.save(block);
	}

}
