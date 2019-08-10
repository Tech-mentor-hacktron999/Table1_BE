package com.dbs.table1.model;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import com.dbs.table1.util.AppConstant;

import lombok.Data;

@Data
public class Message {
	@NotBlank
	private String queueId;
	private String messageId;
	@NotBlank
	private String payload;
	private Date createdAt;
	private Date updatedAt;
	private String status;
	private long ttl;
	
	public Message(String payload,String queueId) {
		this.queueId = queueId;
		this.payload = payload;
		this.createdAt = new Date();
		this.updatedAt = new Date();
		long ttl = AppConstant.MESSAGE_EXPIRY_IN_MIN;
	}

	public String getQueueId() {
		return queueId;
	}
	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getTtl() {
		return ttl;
	}
	public void setTtl(long ttl) {
		this.ttl = ttl;
	}
}
