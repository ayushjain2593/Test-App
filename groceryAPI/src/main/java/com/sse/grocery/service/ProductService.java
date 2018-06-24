package com.sse.grocery.service;

import java.util.List;

import com.sse.grocery.model.Product;

public interface ProductService 
{
	List<Product> getActiveProductsByCategory(String id);
	List<Product> getActiveProductsByBrand(String id);
	List<Product> getActiveProductsByOffer(String id);
	List<Product> getActiveProducts(List<String> ids);
	
	Product getProduct(String id);
	Product saveProduct(Product product);

}
