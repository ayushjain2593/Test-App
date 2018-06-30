package com.sse.grocery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sse.grocery.model.Content;
import com.sse.grocery.model.Product;
import com.sse.grocery.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService 
{
	@Autowired
	private ProductRepository repo;
	
	@Override
	public List<Product> getActiveProductsByCategory(String id)
	{
		return repo.findProductsByCategoryAndActive(id, true);
	}
	
	@Override
	public List<Product> getActiveProductsByBrand(String id)
	{
		return repo.findProductsByBrandAndActive(id, true);
	}
	
	@Override
	public List<Product> getActiveProductsByOffer(String id)
	{
		return repo.findProductsByOfferAndActive(id, true);
	}
	
	@Override
	public List<Content> getActiveProducts(List<String> ids)
	{
		return repo.findProductsByIdsAndActive(ids, true);
	}

	@Override
	public Product getActiveProduct(String id) {
		//Product prod = repo.findOne(id);
		//List<Product> productCategory = repo.findProductsByCategoryInAndActive(prod.getCategory(), true, new PageRequest(0, 5)).getContent();
		//List<Product> productCategory = repo.findProductsByCategoryAndActive(prod.getCategory(), true, 5);
		//List<Product> productBrand = repo.findProductsByBrandAndActive(prod.getBrand(), true, 5);
		/*System.out.println(productCategory.size());
		System.out.println(productBrand.size());*/
		return repo.findOne(id);
	}

	@Override
	public Product saveProduct(Product product) 
	{
		return repo.save(product);
	}

}
