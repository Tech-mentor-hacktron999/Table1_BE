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
}
