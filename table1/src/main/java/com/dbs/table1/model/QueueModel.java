package com.dbs.table1.model;

import javax.validation.constraints.NotBlank;

public class QueueModel {
	@NotBlank
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
