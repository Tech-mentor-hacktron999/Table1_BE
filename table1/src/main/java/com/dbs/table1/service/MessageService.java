package com.dbs.table1.service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.dbs.table1.exception.MaxSizeReachedException;
import com.dbs.table1.exception.QueueEmptyException;
import com.dbs.table1.model.Message;
import com.dbs.table1.util.AppConstant;

@Service
public class MessageService {
	
	//private static SynchronousQueue<Message> messageQueue = new SynchronousQueue<Message>(); 
	
	public static final Map<String, ConcurrentLinkedQueue<Message>>  messageMap = new 
			HashMap<String, ConcurrentLinkedQueue<Message>>();

	public boolean addMessage(String queueId, Message message) {
		if(messageMap.containsKey(queueId)) {
			if(messageMap.get(queueId).size()==AppConstant.LENGTH_OF_QUEUE)
			{
				throw new MaxSizeReachedException("Queue is full "+queueId);
			}
			else
			{
				return messageMap.get(queueId).add(message);
			}
		}
		else {
			throw new ResourceNotFoundException("Queue Id not found " + queueId);
		}
	}
	
	
	public Message fetchMessage(String queueId) {
		if(messageMap.containsKey(queueId)) {
			ConcurrentLinkedQueue<Message> queue = messageMap.get(queueId);
			if(!queue.isEmpty())
			return messageMap.get(queueId).peek();
			else
			throw new QueueEmptyException("Queue is Empty "+queueId); 
		}else {
			throw new ResourceNotFoundException("Queue Id not found " + queueId);
		}
	}
	
	public boolean deleteMessage(String queueId) {
		if(messageMap.containsKey(queueId) ) {
			ConcurrentLinkedQueue<Message> queue = messageMap.get(queueId);
			if(!queue.isEmpty())
			{
			messageMap.get(queueId).remove();
			return true;
			}
			else
			{
				throw new QueueEmptyException("Queue is Empty "+queueId);
			}
		}else {
			throw new ResourceNotFoundException("Queue Id not found " + queueId);
		}
	}
	
	


}
