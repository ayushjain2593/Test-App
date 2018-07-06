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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((about == null) ? 0 : about.hashCode());
		result = prime * result + ((discount == null) ? 0 : discount.hashCode());
		result = prime * result + ((imgurl == null) ? 0 : imgurl.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (!(obj instanceof Brand)) {
			return false;
		}
		Brand other = (Brand) obj;
		if (about == null) {
			if (other.about != null) {
				return false;
			}
		} else if (!about.equals(other.about)) {
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
		return true;
	}
	
	

}
