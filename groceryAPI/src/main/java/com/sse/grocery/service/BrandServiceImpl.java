package com.sse.grocery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sse.grocery.model.Brand;
import com.sse.grocery.model.Content;
import com.sse.grocery.repository.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService {
	@Autowired
	private BrandRepository repo;

	@Override
	public List<Brand> getActiveBrands() {
		return repo.findBrandsByActiveOrderByNameAsc(true);
	}

	@Override
	public List<Content> getActiveBrands(List<String> ids) {
		return repo.findBrandsByIdsAndActive(ids, true);
	}

	/*
	 * @Override public Brand getActiveBrand(String id) { return repo.findOne(id); }
	 */

	@Override
	public Brand saveBrand(Brand brand) {
		return repo.save(brand);
	}

}
