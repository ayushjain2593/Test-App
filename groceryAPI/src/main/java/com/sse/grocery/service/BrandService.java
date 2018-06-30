package com.sse.grocery.service;

import java.util.List;

import com.sse.grocery.model.Brand;
import com.sse.grocery.model.Content;

public interface BrandService 
{
	List<Brand> getActiveBrands();
	List<Content> getActiveBrands(List<String> ids);
	
	
	//Brand getBrand(String id);
	Brand saveBrand(Brand brand);
	

}
