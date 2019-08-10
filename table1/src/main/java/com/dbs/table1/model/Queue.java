package com.dbs.table1.model;

import java.util.Date;

import lombok.Data;

@Data
public class Queue {
	
	private String id;
	private String name;
	private Integer recordLimit;
	private String status;
	private Date createdAt;
	private Date updatedAt;
	

}
