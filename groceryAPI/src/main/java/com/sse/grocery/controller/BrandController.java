package com.sse.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sse.grocery.model.Brand;
import com.sse.grocery.model.Content;
import com.sse.grocery.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController 
{
	@Autowired
	BrandService brandService;
	
	@GetMapping
	public List<Content> getBrands()
	{
		return brandService.getActiveBrands();
	}
	
	@GetMapping(value="/multiple/{brandIds}")
	public List<Content> getBrands(@PathVariable("brandIds") List<String> ids)
	{
		return brandService.getActiveBrands(ids);
	}
	
	
	
	
	@GetMapping(value="/{brandId}")
	public Brand getBrand(@PathVariable("brandId") String brandId)
	{
		return brandService.getBrand(brandId);
	}
	
	@PostMapping
	public Brand saveBrand(@RequestBody Brand brand)
	{
		return brandService.saveBrand(brand);
	}

}
