package com.sse.grocery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sse.grocery.model.Product;
import com.sse.grocery.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService 
{
	@Autowired
	private ProductRepository prodRepo;
	
	@Override
	public List<Product> getActiveProductsByCategory(String id)
	{
		return prodRepo.findProductsByCategoryAndActive(id, true);
	}
	
	@Override
	public List<Product> getActiveProductsByBrand(String id)
	{
		return prodRepo.findProductsByBrandAndActive(id, true);
	}
	
	@Override
	public List<Product> getActiveProductsByOffer(String id)
	{
		return prodRepo.findProductsByOfferAndActive(id, true);
	}
	
	@Override
	public List<Product> getActiveProducts(List<String> ids)
	{
		return prodRepo.findProductsByIdsAndActive(ids, true);
	}

	@Override
	public Product getProduct(String id) {
		return prodRepo.findOne(id);
	}

	@Override
	public Product saveProduct(Product product) 
	{
		return prodRepo.save(product);
	}

}
