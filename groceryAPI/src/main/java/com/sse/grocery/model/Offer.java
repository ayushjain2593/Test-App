package com.sse.grocery.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "offer")
@TypeAlias("offer")

public class Offer extends GenericProperties implements Content, Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String imgurl;
	private String code;
	private String about;
	private List<String> productList;

	public Offer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Offer(String name, String imgurl, String code, String about, List<String> productList) {
		super();
		this.name = name;
		this.imgurl = imgurl;
		this.code = code;
		this.about = about;
		this.productList = productList;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public List<String> getProductList() {
		return productList;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}

}
