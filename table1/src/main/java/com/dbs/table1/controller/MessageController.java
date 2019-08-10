package com.dbs.table1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.table1.model.Message;
import com.dbs.table1.service.MessageService;  

@RestController
@RequestMapping("/message")
public class MessageController {

	@Autowired
	private MessageService messageService;

	
	@PostMapping("/add/{id}")
	public void addMessage(@PathVariable(name = "id") String queueId, @Valid @RequestBody Message message){
		messageService.addMessage(queueId, message);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMessage(@PathVariable(name = "id") String queueId){
		messageService.deleteMessage(queueId);
	}
	
	@GetMapping("/{id}")
	public Message fetchMessage(@PathVariable(name = "id") String queueId){
		return messageService.fetchMessage(queueId);
	}

	

}
