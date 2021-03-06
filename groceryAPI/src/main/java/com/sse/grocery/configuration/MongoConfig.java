package com.sse.grocery.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "com.sse.grocery.repository")
@EnableMongoAuditing
public class MongoConfig extends AbstractMongoConfiguration 
{

	@Override
	protected String getDatabaseName() {
		return "GroceryDB";
	}
	
	@Override
	@Bean
	public Mongo mongo() throws Exception {
		return new MongoClient();
	}

}