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
	

	public boolean equals(Object o)
	{
		
		if(o instanceof Queue)
		{
			Queue temp = (Queue)o;
			return this.id.equals(temp.id);
		}
		
		return false;
		
		
	}
}
