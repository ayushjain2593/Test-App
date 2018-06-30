package com.sse.grocery.service;

import java.util.List;

import com.sse.grocery.model.Content;
import com.sse.grocery.model.Product;

public interface ProductService 
{
	List<Product> getActiveProductsByCategory(String id);
	List<Product> getActiveProductsByBrand(String id);
	List<Product> getActiveProductsByOffer(String id);
	List<Content> getActiveProducts(List<String> ids);
	
	Product getActiveProduct(String id);
	Product saveProduct(Product product);

}
