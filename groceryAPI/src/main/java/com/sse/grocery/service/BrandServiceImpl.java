package com.sse.grocery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sse.grocery.model.Brand;
import com.sse.grocery.model.Content;
import com.sse.grocery.repository.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService 
{
	@Autowired
	private BrandRepository brandRepo;
	
	@Override
	public List<Content> getActiveBrands() 
	{
		//return brandRepo.findBrandByActive(true);
		return brandRepo.findBrandsByActiveOrderByNameAsc(true);
	}
	
	@Override
	public List<Content> getActiveBrands(List<String> ids)
	{
		System.out.println("IDS:" + ids);
		return brandRepo.findBrandsByIdsAndActive(ids, true);
	}
	
	

	@Override
	public Brand getBrand(String id) 
	{
		return brandRepo.findOne(id);
	}
	
	@Override
	public Brand saveBrand(Brand brand)
	{
		return brandRepo.save(brand);
	}

}
