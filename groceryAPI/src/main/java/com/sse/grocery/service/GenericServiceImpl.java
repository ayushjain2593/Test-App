package com.sse.grocery.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sse.grocery.model.Content;

//public class GenericServiceImpl<T extends MongoRepository<T, K>, K extends Serializable> implements GenericService<T, K>
public class GenericServiceImpl<T extends Content, K extends MongoRepository<T, I>, I extends Serializable> implements GenericService<T, K, I>
{
	
	private K repo;
	
	public T getById(I id)
	{
		return repo.findOne(id);
	}
	
	/*public List<T> getActiveDataByIds(List<I> ids)
	{
		repo.findById(ids);
	}*/

}
