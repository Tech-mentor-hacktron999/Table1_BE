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
	
	
	

}
