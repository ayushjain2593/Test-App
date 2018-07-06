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
	// @JsonIgnore
	private List<String> offer;
	private String group;
	private List<Variant> variant;
	private String tags;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String about, List<String> category, String brand, List<String> offer, String group,
			List<Variant> variant, String tags) {
		super();
		this.name = name;
		this.about = about;
		this.category = category;
		this.brand = brand;
		this.offer = offer;
		this.group = group;
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

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((about == null) ? 0 : about.hashCode());
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((offer == null) ? 0 : offer.hashCode());
		result = prime * result + ((tags == null) ? 0 : tags.hashCode());
		result = prime * result + ((variant == null) ? 0 : variant.hashCode());
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
		if (!(obj instanceof Product)) {
			return false;
		}
		Product other = (Product) obj;
		if (about == null) {
			if (other.about != null) {
				return false;
			}
		} else if (!about.equals(other.about)) {
			return false;
		}
		if (brand == null) {
			if (other.brand != null) {
				return false;
			}
		} else if (!brand.equals(other.brand)) {
			return false;
		}
		if (category == null) {
			if (other.category != null) {
				return false;
			}
		} else if (!category.equals(other.category)) {
			return false;
		}
		if (group == null) {
			if (other.group != null) {
				return false;
			}
		} else if (!group.equals(other.group)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (offer == null) {
			if (other.offer != null) {
				return false;
			}
		} else if (!offer.equals(other.offer)) {
			return false;
		}
		if (tags == null) {
			if (other.tags != null) {
				return false;
			}
		} else if (!tags.equals(other.tags)) {
			return false;
		}
		if (variant == null) {
			if (other.variant != null) {
				return false;
			}
		} else if (!variant.equals(other.variant)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", about=" + about + ", category=" + category + ", brand=" + brand + ", offer="
				+ offer + ", variant=" + variant + ", tags=" + tags + "]";
	}

}
