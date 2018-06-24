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

@Document(collection = "offer")
@JsonIgnoreProperties({ "version", "createdDate", "lastModifiedDate", "active" })
public class Offer implements Content, Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String name;
	private String imgurl;
	private String code;
	private String about;
	private Integer type;
	private List<String> productList;
	@Version
	private Long version;
	@CreatedDate
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date createdDate;
	@LastModifiedDate
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date lastModifiedDate;
	private Boolean active = true;

	public Offer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Offer(String id, String name, String imgurl, String code, String about, Integer type,
			List<String> productList, Long version, Date createdDate, Date lastModifiedDate, Boolean active) {
		super();
		this.id = id;
		this.name = name;
		this.imgurl = imgurl;
		this.code = code;
		this.about = about;
		this.type = type;
		this.productList = productList;
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

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public List<String> getProductList() {
		return productList;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
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
