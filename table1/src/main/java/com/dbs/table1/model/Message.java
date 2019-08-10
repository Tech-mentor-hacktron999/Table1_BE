package com.dbs.table1.model;

import java.util.Date;


import lombok.Data;

@Data
public class Message {
	private String messageId;
	private String payload;
	private Date createdAt;
	private Date updatedAt;
	private String status;
	private long ttl;
}
