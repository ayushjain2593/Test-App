package com.sse.grocery.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
@TypeAlias("product")

public class Product extends GenericProperties implements Content, Serializable {
	private static final long serialVersionUID = 1L;

	private String name;
	private String about;
	private List<String> category;
	private String brand;
	//@JsonIgnore
	private List<String> offer;
	private List<Variant> variant;
	private String tags;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String about, List<String> category, String brand, List<String> offer,
			List<Variant> variant, String tags) {
		super();
		this.name = name;
		this.about = about;
		this.category = category;
		this.brand = brand;
		this.offer = offer;
		this.variant = variant;
		this.tags = tags;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public List<String> getCategory() {
		return category;
	}

	public void setCategory(List<String> category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public List<String> getOffer() {
		return offer;
	}

	public void setOffer(List<String> offer) {
		this.offer = offer;
	}

	public List<Variant> getVariant() {
		return variant;
	}

	public void setVariant(List<Variant> variant) {
		this.variant = variant;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", about=" + about + ", category=" + category + ", brand=" + brand + ", offer="
				+ offer + ", variant=" + variant + ", tags=" + tags + "]";
	}

}
