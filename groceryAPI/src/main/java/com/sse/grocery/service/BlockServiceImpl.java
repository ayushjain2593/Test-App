package com.sse.grocery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sse.grocery.model.Block;
import com.sse.grocery.model.enums.Page;
import com.sse.grocery.repository.BlockRepository;
import com.sse.grocery.utility.ListUtils;

@Service
public class BlockServiceImpl implements BlockService 
{
	@Autowired
	private BlockRepository repo;
	@Autowired
	private CategoryService cService;
	@Autowired
	private BrandService bService;
	@Autowired
	private ProductService pService;
	@Autowired
	private OfferService oService;
	
	@Override
	public List<Block> getActiveBlockList(Page page)
	{
		List<Block> blockList = repo.findBlocksByPageOrderByBlockNoAsc(page);
		if(ListUtils.hasElements(blockList))
		{
			for (Block block : blockList) 
			{
				switch (block.getType()) 
				{
				case 1:
					block.setContent(cService.getActiveCategories(block.getContentRef()));
					break;
				case 2:
					block.setContent(bService.getActiveBrands(block.getContentRef()));
					break;
				case 3:
					block.setContent(oService.getActiveOffers(block.getContentRef()));
					break;
				case 4:
					block.setContent(pService.getActiveProducts(block.getContentRef()));
					break;
				}
			}
		}
		return blockList;
	}
	
	@Override
	public Block saveBlock(Block block)
	{
		return repo.save(block);
	}

}
