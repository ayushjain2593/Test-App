package com.sse.grocery.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "category")
// @JsonIgnoreProperties({"version", "createdDate", "lastModifiedDate",
// "active"})
public class Category extends GenericProperties implements Content, Serializable {
	private static final long serialVersionUID = 1L;
	/*
	 * @Id private String id;
	 */
	private String name;
	private String imgurl;
	private String about;
	private Float discount;
	/* private String discountCap; */
	private boolean parent = true;
	@DBRef
	private List<Category> subCategory;
	/*
	 * @Version private Long version;
	 * 
	 * @CreatedDate
	 * 
	 * @JsonFormat(pattern="dd-MM-yyyy") private Date createdDate;
	 * 
	 * @LastModifiedDate
	 * 
	 * @JsonFormat(pattern="dd-MM-yyyy") private Date lastModifiedDate; private
	 * Boolean active = true;
	 */

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

	/*
	 * public Category(String id, String name, String imgurl, String about, Float
	 * discount, boolean parent, List<Category> subCategory, Long version, Date
	 * createdDate, Date lastModifiedDate, Boolean active) { super(); this.id = id;
	 * this.name = name; this.imgurl = imgurl; this.about = about; this.discount =
	 * discount; this.parent = parent; this.subCategory = subCategory; this.version
	 * = version; this.createdDate = createdDate; this.lastModifiedDate =
	 * lastModifiedDate; this.active = active; }
	 */

	/*
	 * public String getId() { return id; }
	 * 
	 * public void setId(String id) { this.id = id; }
	 */

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

	/*
	 * public Long getVersion() { return version; }
	 * 
	 * public void setVersion(Long version) { this.version = version; }
	 * 
	 * public Date getCreatedDate() { return createdDate; }
	 * 
	 * public void setCreatedDate(Date createdDate) { this.createdDate =
	 * createdDate; }
	 * 
	 * public Date getLastModifiedDate() { return lastModifiedDate; }
	 * 
	 * public void setLastModifiedDate(Date lastModifiedDate) {
	 * this.lastModifiedDate = lastModifiedDate; }
	 * 
	 * public Boolean isActive() { return active; }
	 * 
	 * public void setActive(Boolean active) { this.active = active; }
	 */

}