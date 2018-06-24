package com.sse.grocery.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document(collection = "product")
@JsonIgnoreProperties({ "version", "createdDate", "lastModifiedDate", "active" })
public class Product implements Content, Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String name;
	private String about;
	private List<String> category;
	private String brand;
	private List<String> offer;
	private List<Variant> variant;
	// private boolean isComboProduct;
	private String tags;
	@Version
	private Long version;
	@CreatedDate
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date createdDate;
	@LastModifiedDate
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date lastModifiedDate;
	private Boolean active = true;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String id, String name, String about, List<String> category, String brand, List<String> offer,
			List<Variant> variant, String tags, Long version, Date createdDate, Date lastModifiedDate, Boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.about = about;
		this.category = category;
		this.brand = brand;
		this.offer = offer;
		this.variant = variant;
		this.tags = tags;
		this.version = version;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
		this.active = active;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

}
