package com.sse.grocery.model;

import java.io.Serializable;

import com.sse.grocery.model.enums.Measure;
import com.sse.grocery.model.enums.PackType;

public class Variant implements Serializable {
	private static final long serialVersionUID = 1L;
	private String imgurl;

	private Float mrp;
	private Float discount;
	private Float cashback;

	private Float unit;
	private Measure measure;
	private Integer packQuantity;
	private PackType packType;

	private Integer maxOrder;
	private Boolean inStock;
	private Boolean isDefault;

	public Variant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Variant(String imgurl, Float mrp, Float discount, Float cashback, Float unit, Measure measure,
			Integer packQuantity, PackType packType, Integer maxOrder, Boolean inStock, Boolean isDefault) {
		super();
		this.imgurl = imgurl;
		this.mrp = mrp;
		this.discount = discount;
		this.cashback = cashback;
		this.unit = unit;
		this.measure = measure;
		this.packQuantity = packQuantity;
		this.packType = packType;
		this.maxOrder = maxOrder;
		this.inStock = inStock;
		this.isDefault = isDefault;
	}

	public String getImgurl() {
		return imgurl;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public Float getMrp() {
		return mrp;
	}

	public void setMrp(Float mrp) {
		this.mrp = mrp;
	}

	public Float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Float getCashback() {
		return cashback;
	}

	public void setCashback(Float cashback) {
		this.cashback = cashback;
	}

	public Float getUnit() {
		return unit;
	}

	public void setUnit(Float unit) {
		this.unit = unit;
	}

	public Measure getMeasure() {
		return measure;
	}

	public void setMeasure(Measure measure) {
		this.measure = measure;
	}

	public Integer getPackQuantity() {
		return packQuantity;
	}

	public void setPackQuantity(Integer packQuantity) {
		this.packQuantity = packQuantity;
	}

	public PackType getPackType() {
		return packType;
	}

	public void setPackType(PackType packType) {
		this.packType = packType;
	}

	public Integer getMaxOrder() {
		return maxOrder;
	}

	public void setMaxOrder(Integer maxOrder) {
		this.maxOrder = maxOrder;
	}

	public Boolean getInStock() {
		return inStock;
	}

	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}

	public Boolean getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cashback == null) ? 0 : cashback.hashCode());
		result = prime * result + ((discount == null) ? 0 : discount.hashCode());
		result = prime * result + ((imgurl == null) ? 0 : imgurl.hashCode());
		result = prime * result + ((inStock == null) ? 0 : inStock.hashCode());
		result = prime * result + ((isDefault == null) ? 0 : isDefault.hashCode());
		result = prime * result + ((maxOrder == null) ? 0 : maxOrder.hashCode());
		result = prime * result + ((measure == null) ? 0 : measure.hashCode());
		result = prime * result + ((mrp == null) ? 0 : mrp.hashCode());
		result = prime * result + ((packQuantity == null) ? 0 : packQuantity.hashCode());
		result = prime * result + ((packType == null) ? 0 : packType.hashCode());
		result = prime * result + ((unit == null) ? 0 : unit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Variant)) {
			return false;
		}
		Variant other = (Variant) obj;
		if (cashback == null) {
			if (other.cashback != null) {
				return false;
			}
		} else if (!cashback.equals(other.cashback)) {
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
		if (inStock == null) {
			if (other.inStock != null) {
				return false;
			}
		} else if (!inStock.equals(other.inStock)) {
			return false;
		}
		if (isDefault == null) {
			if (other.isDefault != null) {
				return false;
			}
		} else if (!isDefault.equals(other.isDefault)) {
			return false;
		}
		if (maxOrder == null) {
			if (other.maxOrder != null) {
				return false;
			}
		} else if (!maxOrder.equals(other.maxOrder)) {
			return false;
		}
		if (measure != other.measure) {
			return false;
		}
		if (mrp == null) {
			if (other.mrp != null) {
				return false;
			}
		} else if (!mrp.equals(other.mrp)) {
			return false;
		}
		if (packQuantity == null) {
			if (other.packQuantity != null) {
				return false;
			}
		} else if (!packQuantity.equals(other.packQuantity)) {
			return false;
		}
		if (packType != other.packType) {
			return false;
		}
		if (unit == null) {
			if (other.unit != null) {
				return false;
			}
		} else if (!unit.equals(other.unit)) {
			return false;
		}
		return true;
	}
}
