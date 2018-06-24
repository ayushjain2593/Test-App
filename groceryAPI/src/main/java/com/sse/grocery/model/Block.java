package com.sse.grocery.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sse.grocery.model.enums.Orientation;

@Document(collection = "block")
@JsonIgnoreProperties({ "id", "version", "createdDate", "lastModifiedDate", "active" })
public class Block implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private int blockNo;
	private String name;
	private Integer type;
	private Integer showLimit;
	private Boolean isNameVisible;
	private Orientation orientation;
	@Transient
	private List<Content> content;
	private List<String> contentRef;
	@Version
	private Long version;
	@CreatedDate
	private Date createdDate;
	@LastModifiedDate
	private Date lastModifiedDate;
	private boolean active = true;

	public Block() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Block(String id, int blockNo, String name, Integer type, Integer showLimit, Boolean isNameVisible,
			Orientation orientation, List<Content> content, List<String> contentRef, Long version, Date createdDate,
			Date lastModifiedDate, boolean active) {
		super();
		this.id = id;
		this.blockNo = blockNo;
		this.name = name;
		this.type = type;
		this.showLimit = showLimit;
		this.isNameVisible = isNameVisible;
		this.orientation = orientation;
		this.content = content;
		this.contentRef = contentRef;
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Block [id=" + id + ", blockNo=" + blockNo + ", name=" + name + ", type=" + type + ", showLimit="
				+ showLimit + ", isNameVisible=" + isNameVisible + ", orientation=" + orientation + ", content="
				+ content + ", contentRef=" + contentRef + ", version=" + version + ", createdDate=" + createdDate
				+ ", lastModifiedDate=" + lastModifiedDate + ", active=" + active + "]";
	}
	
	

}
