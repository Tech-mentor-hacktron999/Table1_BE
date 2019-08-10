package com.dbs.table1.service;

import java.util.concurrent.SynchronousQueue;

import com.dbs.table1.model.Message;

public class MessageService {
	
	private static SynchronousQueue<Message> messageQueue = new SynchronousQueue<Message>(); 
	
	public boolean addMessage(String queueId, Message message) {
		return false;
		
	}
	
	
	public Message fetchMessage(String queueId) {
		return null;
		
	}
	
	
	public boolean deleteMessage(String queueId) {
		
		return false;
		
	}
	
	


}
