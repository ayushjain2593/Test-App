package com.sse.grocery.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "version", "createdDate", "lastModifiedDate", "active" })
public abstract class GenericProperties {
	private String id;
	@Version
	private long version;
	@CreatedDate
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date createdDate;
	@LastModifiedDate
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date lastModifiedDate;
	private boolean active = true;

	public GenericProperties() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenericProperties(String id, Long version, Date createdDate, Date lastModifiedDate, Boolean active) {
		super();
		this.id = id;
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

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (!(obj instanceof GenericProperties))
			return false;
		
		GenericProperties other = (GenericProperties)obj;
		
		if (active != other.active)
			return false;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} 
		else if (!id.equals(other.id))
			return false;
		
		return true;
	}

	/*
	 * @Override public boolean equals(final Object obj) {
	 * 
	 * if (obj instanceof GenericProperties) { final GenericProperties other =
	 * (GenericProperties) obj; return Objects.equals(id, other.id) && active ==
	 * other.active; } else return false;
	 * 
	 * if (this == obj) return true; if ((obj == null) || (obj.getClass() !=
	 * getClass())) return false; GenericProperties prop = (GenericProperties) obj;
	 * return Objects.equals(id, prop.id) && active == prop.active; }
	 */

}
