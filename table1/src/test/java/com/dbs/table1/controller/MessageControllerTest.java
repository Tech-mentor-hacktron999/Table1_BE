package com.dbs.table1.controller;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dbs.table1.model.Message;
import com.dbs.table1.service.MessageService;
import com.dbs.table1.service.QueueService;

public class MessageControllerTest {
	
	private MessageService messageService;
	
	@Before
	public void setUp(){
		messageService = new MessageService();	
	}
	@Test
	public void addMessageTest(String queueId, Message message){
		
	}
	
	@Test
	public void deleteMessageTest(String queueId){
		
	}
	
	@Test
	public void fetchMessageTest(String queueId){
		
	}
	
	@After
	public void tearDown(){
		messageService = null;
	}
}
