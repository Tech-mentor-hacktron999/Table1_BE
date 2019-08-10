package com.dbs.table1.service;

import java.util.concurrent.SynchronousQueue;

import com.dbs.table1.model.Message;

public class MessageService {
	
	private static SynchronousQueue<Message> messageQueue = new SynchronousQueue<Message>(); 


}
