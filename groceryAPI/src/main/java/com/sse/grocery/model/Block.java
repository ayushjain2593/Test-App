package com.sse.grocery.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import com.sse.grocery.model.enums.Orientation;
import com.sse.grocery.model.enums.Page;

@Document(collection = "block")
@TypeAlias("block")
public class Block extends GenericProperties implements Serializable {

	private static final long serialVersionUID = 1L;

	private int blockNo;
	private String name;
	private Integer type;
	private Integer showLimit;
	private Boolean isNameVisible;
	private Orientation orientation;
	private Page page;
	@Transient
	private List<Content> content;
	private List<String> contentRef;

	public Block() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Block(int blockNo, String name, Integer type, Integer showLimit, Boolean isNameVisible,
			Orientation orientation, Page page, List<Content> content, List<String> contentRef) {
		super();
		this.blockNo = blockNo;
		this.name = name;
		this.type = type;
		this.showLimit = showLimit;
		this.isNameVisible = isNameVisible;
		this.orientation = orientation;
		this.page = page;
		this.content = content;
		this.contentRef = contentRef;
	}

	public int getBlockNo() {
		return blockNo;
	}

	public void setBlockNo(int blockNo) {
		this.blockNo = blockNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getShowLimit() {
		return showLimit;
	}

	public void setShowLimit(Integer showLimit) {
		this.showLimit = showLimit;
	}

	public Boolean getIsNameVisible() {
		return isNameVisible;
	}

	public void setIsNameVisible(Boolean isNameVisible) {
		this.isNameVisible = isNameVisible;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public List<Content> getContent() {
		return content;
	}

	public void setContent(List<Content> content) {
		this.content = content;
	}

	public List<String> getContentRef() {
		return contentRef;
	}

	public void setContentRef(List<String> contentRef) {
		this.contentRef = contentRef;
	}
}
