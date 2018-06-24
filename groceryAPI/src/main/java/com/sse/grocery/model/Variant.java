package com.sse.grocery.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sse.grocery.model.enums.Measure;

public class Variant implements Serializable {
	private static final long serialVersionUID = 1L;
	private String imgurl;

	private Float mrp;
	private Float discount;
	private Float cashback;

	private Float unit;
	private Measure measure;
	private Integer packQuantity;

	private Integer maxOrder;
	private Boolean inStock;
	private Boolean isDefault;
	@JsonIgnore
	private Integer stock;

	public Variant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Variant(String imgurl, Float mrp, Float discount, Float cashback, Float unit, Measure measure,
			Integer packQuantity, Integer maxOrder, Boolean inStock, Boolean isDefault, Integer stock) {
		super();
		this.imgurl = imgurl;
		this.mrp = mrp;
		this.discount = discount;
		this.cashback = cashback;
		this.unit = unit;
		this.measure = measure;
		this.packQuantity = packQuantity;
		this.maxOrder = maxOrder;
		this.inStock = inStock;
		this.isDefault = isDefault;
		this.stock = stock;
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

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

}
