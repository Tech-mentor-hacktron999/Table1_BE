package com.dbs.table1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.table1.service.MessageService;  

@RestController
public class MessageController {
	
@Autowired
private MessageService messageService;
	@GetMapping("queue/")
	public void getQueues(){
		
	}

}
