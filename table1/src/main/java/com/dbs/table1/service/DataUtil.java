package com.dbs.table1.service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.stereotype.Component;

import com.dbs.table1.model.Message;

@Component
public class DataUtil {

	public static Map<String, ConcurrentLinkedQueue<Message>>  messageMap = new 
			HashMap<String, ConcurrentLinkedQueue<Message>>();
	
	public Message getMessageForAQueue(String queueId) {
		if(messageMap.get(queueId) != null ) {
			return messageMap.get(queueId).isEmpty()? null: messageMap.get(queueId).element();
		}else {
			return null;
		}
	}
	
	public boolean deleteMessageByQueueId(String queueId) {
		if(messageMap.get(queueId) != null ) {
			 if(!messageMap.get(queueId).isEmpty()) {
				 messageMap.get(queueId).remove();
			 }
		}
		return true;
	}
}
