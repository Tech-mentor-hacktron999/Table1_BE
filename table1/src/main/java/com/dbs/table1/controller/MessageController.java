package com.dbs.table1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.table1.model.Message;
import com.dbs.table1.service.MessageService;  

@RestController
@RequestMapping("/message")
public class MessageController {

	@Autowired
	private MessageService messageService;

	
	@PostMapping("/add")
	public void addMessage(String queueId, @Valid Message message){
		messageService.addMessage(queueId, message);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMessage(@PathVariable(name = "id") String queueId){
		messageService.deleteMessage(queueId);
	}
	
	@GetMapping("/{id}")
	public void fetchMessage(@PathVariable(name = "id") String queueId){
		messageService.fetchMessage(queueId);
	}

	

}
