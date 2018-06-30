package com.sse.grocery.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "category")
@TypeAlias("category")
public class Category extends GenericProperties implements Content, Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String imgurl;
	private String about;
	private Float discount;
	private boolean parent = true;
	@DBRef
	private List<Category> subCategory;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(String name, String imgurl) {
		super();
		this.name = name;
		this.imgurl = imgurl;
	}

	public Category(String name, String imgurl, String about, Float discount, boolean parent,
			List<Category> subCategory) {
		super();
		this.name = name;
		this.imgurl = imgurl;
		this.about = about;
		this.discount = discount;
		this.parent = parent;
		this.subCategory = subCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public boolean isParent() {
		return parent;
	}

	public void setParent(boolean parent) {
		this.parent = parent;
	}

	public List<Category> getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(List<Category> subCategory) {
		this.subCategory = subCategory;
	}

}