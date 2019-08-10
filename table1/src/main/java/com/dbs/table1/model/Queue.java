package com.dbs.table1.model;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import com.dbs.table1.util.AppConstant;

import lombok.Data;

@Data
public class Queue {
	
	private String id;
	@NotBlank
	private String name;
	private Integer recordLimit;
	private String status;
	private Date createdAt;
	private Date updatedAt;
	
	public Queue(String name, String id) {
		this.id = id;
		this.name = name;
		this.status = AppConstant.DEFAULT_QUEUE_STATUS;
		this.recordLimit = 500;
		this.createdAt = new Date();
		this.updatedAt = new Date();
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRecordLimit() {
		return recordLimit;
	}
	public void setRecordLimit(Integer recordLimit) {
		this.recordLimit = recordLimit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	

}
