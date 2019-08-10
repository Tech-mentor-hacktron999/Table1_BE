package com.dbs.table1.service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.dbs.table1.model.Message;

@Service
public class MessageService {
	
	//private static SynchronousQueue<Message> messageQueue = new SynchronousQueue<Message>(); 
	
	public static Map<String, ConcurrentLinkedQueue<Message>>  messageMap = new 
			HashMap<String, ConcurrentLinkedQueue<Message>>();
	
	public boolean addMessage(String queueId, Message message) {
		if(messageMap.containsKey(queueId)) {
			return messageMap.get(queueId).add(message);
		}else {
			throw new ResourceNotFoundException("Queue Id not found " + queueId);
		}
	}
	
	
	public Message fetchMessage(String queueId) {
		if(messageMap.containsKey(queueId)) {
			return messageMap.get(queueId).peek();
		}else {
			throw new ResourceNotFoundException("Queue Id not found " + queueId);
		}
		
	}
	
	
	public boolean deleteMessage(String queueId) {
		if(messageMap.containsKey(queueId) ) {
			messageMap.get(queueId).remove();
			return true;
		}else {
			throw new ResourceNotFoundException("Queue Id not found " + queueId);
		}
		
	}
	
	


}
