package com.dbs.table1.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.table1.model.Message;
import com.dbs.table1.service.MessageService;  

@RestController
public class MessageController {

	@Autowired
	private MessageService messageService;

	
	@PostMapping("message/add")
	public void addMessage(String queueId, Message message){
		messageService.addMessage(queueId, message);
	}
	
	@DeleteMapping("queue/{id}")
	public void deleteMessage(String queueId){
		messageService.deleteMessage(queueId);
	}
	
	@GetMapping("queue/")
	public void fetchMessage(String queueId){
		messageService.fetchMessage(queueId);
	}

	

}
