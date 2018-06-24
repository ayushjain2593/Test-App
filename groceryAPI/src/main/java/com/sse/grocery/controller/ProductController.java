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
	private ProductService prodService;
	
	@GetMapping("/category/{categoryId}")
	public List<Product> getProductsByCategory(@PathVariable("categoryId") String id)
	{
		return prodService.getActiveProductsByCategory(id);
	}
	
	@GetMapping("/brand/{brandId}")
	public List<Product> getProductsByBrand(@PathVariable("brandId") String id)
	{
		return prodService.getActiveProductsByBrand(id);
	}
	
	@GetMapping("/offer/{offerId}")
	public List<Product> getProductByOffer(@PathVariable("offerId") String id)
	{
		return prodService.getActiveProductsByOffer(id);
	}
	
	@GetMapping("/{productId}")
	public Product getProduct(@PathVariable("productId") String id)
	{
		return prodService.getProduct(id);
	}
	
	@PostMapping
	public Product saveProduct(@RequestBody Product product)
	{
		return prodService.saveProduct(product);
	}

}
