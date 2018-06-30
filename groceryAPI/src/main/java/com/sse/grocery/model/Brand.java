package com.sse.grocery.model;

import java.io.Serializable;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "brand")
@TypeAlias("brand")
public class Brand extends GenericProperties implements Content, Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String about;
	private String imgurl;
	private Float discount;

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brand(String name, String about, String imgurl, Float discount) {
		super();
		this.name = name;
		this.about = about;
		this.imgurl = imgurl;
		this.discount = discount;
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

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

}
