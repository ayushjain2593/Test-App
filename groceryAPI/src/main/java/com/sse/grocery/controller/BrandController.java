package com.sse.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sse.grocery.model.Brand;
import com.sse.grocery.service.BrandService;

@RestController
@RequestMapping("/brand")
public class BrandController 
{
	@Autowired
	private BrandService service;
	
	@GetMapping
	public List<Brand> getActiveBrands()
	{
		return service.getActiveBrands();
	}
	
	@PostMapping
	public Brand saveBrand(@RequestBody Brand brand)
	{
		return service.saveBrand(brand);
	}
	
	/*@GetMapping(value="/multiple/{brandIds}")
	public List<Content> getBrands(@PathVariable("brandIds") List<String> ids)
	{
		return brandService.getActiveBrands(ids);
	}*/
	
	
	/*@GetMapping(value="/{brandId}")
	public Brand getBrand(@PathVariable("brandId") String brandId)
	{
		return brandService.getBrand(brandId);
	}*/
}
