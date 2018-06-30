package com.sse.grocery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sse.grocery.model.Product;
import com.sse.grocery.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController 
{
	@Autowired
	private ProductService service;
	
	@GetMapping("/category/{categoryId}")
	public List<Product> getActiveProductsByCategory(@PathVariable("categoryId") String id)
	{
		return service.getActiveProductsByCategory(id);
	}
	
	@GetMapping("/brand/{brandId}")
	public List<Product> getActiveProductsByBrand(@PathVariable("brandId") String id)
	{
		return service.getActiveProductsByBrand(id);
	}
	
	@GetMapping("/offer/{offerId}")
	public List<Product> getActiveProductsByOffer(@PathVariable("offerId") String id)
	{
		return service.getActiveProductsByOffer(id);
	}
	
	@GetMapping("/{productId}")
	public Product getActiveProduct(@PathVariable("productId") String id)
	{
		return service.getActiveProduct(id);
	}
	
	@PostMapping
	public Product saveProduct(@RequestBody Product product)
	{
		return service.saveProduct(product);
	}

}
