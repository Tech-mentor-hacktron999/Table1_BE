package com.dbs.table1.model;

import java.util.Date;


import lombok.Data;

@Data
public class Message {
	private String queueId;
	private String messageId;
	private String payload;
	private Date createdAt;
	private Date updatedAt;
	private String status;
	private long ttl;
}
