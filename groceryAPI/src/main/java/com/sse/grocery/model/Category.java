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
	private List<String> categoryGroup;
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

	public Category(String name, String imgurl, String about, Float discount, boolean parent, List<String> categoryGroup, 
			List<Category> subCategory) {
		super();
		this.name = name;
		this.imgurl = imgurl;
		this.about = about;
		this.discount = discount;
		this.parent = parent;
		this.categoryGroup = categoryGroup;
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

	public List<String> getCategoryGroup() {
		return categoryGroup;
	}

	public void setCategoryGroup(List<String> categoryGroup) {
		this.categoryGroup = categoryGroup;
	}

	public List<Category> getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(List<Category> subCategory) {
		this.subCategory = subCategory;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((about == null) ? 0 : about.hashCode());
		result = prime * result + ((categoryGroup == null) ? 0 : categoryGroup.hashCode());
		result = prime * result + ((discount == null) ? 0 : discount.hashCode());
		result = prime * result + ((imgurl == null) ? 0 : imgurl.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (parent ? 1231 : 1237);
		result = prime * result + ((subCategory == null) ? 0 : subCategory.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Category)) {
			return false;
		}
		Category other = (Category) obj;
		if (about == null) {
			if (other.about != null) {
				return false;
			}
		} else if (!about.equals(other.about)) {
			return false;
		}
		if (categoryGroup == null) {
			if (other.categoryGroup != null) {
				return false;
			}
		} else if (!categoryGroup.equals(other.categoryGroup)) {
			return false;
		}
		if (discount == null) {
			if (other.discount != null) {
				return false;
			}
		} else if (!discount.equals(other.discount)) {
			return false;
		}
		if (imgurl == null) {
			if (other.imgurl != null) {
				return false;
			}
		} else if (!imgurl.equals(other.imgurl)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (parent != other.parent) {
			return false;
		}
		if (subCategory == null) {
			if (other.subCategory != null) {
				return false;
			}
		} else if (!subCategory.equals(other.subCategory)) {
			return false;
		}
		return true;
	}
	
	

}