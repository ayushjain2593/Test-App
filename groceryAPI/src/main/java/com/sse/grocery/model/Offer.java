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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((about == null) ? 0 : about.hashCode());
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((imgurl == null) ? 0 : imgurl.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((productList == null) ? 0 : productList.hashCode());
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
		if (!(obj instanceof Offer)) {
			return false;
		}
		Offer other = (Offer) obj;
		if (about == null) {
			if (other.about != null) {
				return false;
			}
		} else if (!about.equals(other.about)) {
			return false;
		}
		if (code == null) {
			if (other.code != null) {
				return false;
			}
		} else if (!code.equals(other.code)) {
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
		if (productList == null) {
			if (other.productList != null) {
				return false;
			}
		} else if (!productList.equals(other.productList)) {
			return false;
		}
		return true;
	}
	
	

	/*@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if ((obj == null) || (obj.getClass() != getClass()))
			return false;
		if (!super.equals(obj))
			return false;
		Offer offer = (Offer) obj;
		return (name == offer.name || (name != null && name.equals(offer.getName())))
				&& (imgurl == offer.imgurl || (imgurl != null && imgurl.equals(offer.getImgurl())))
				&& (code == offer.code || (code != null && code.equals(offer.getCode())))
				&& (about == offer.about || (about != null && about.equals(offer.getAbout())))
				&& (productList == offer.productList
						|| (productList != null && productList.containsAll(offer.productList)));
	}*/

	/*
	 * @Override public int hashCode() { return Objects.hash(arg0); final int prime
	 * = 31; int result = 1; result = prime * result + ((firstName == null) ? 0 :
	 * firstName.hashCode()); result = prime * result + id; result = prime * result
	 * + ((lastName == null) ? 0 : lastName.hashCode()); return result; }
	 */

}
