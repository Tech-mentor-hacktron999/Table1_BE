package com.dbs.table1.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.table1.model.Queue;
import com.dbs.table1.model.QueueModel;

@Service
public class QueueService {
	
	@Autowired
	DataUtil dataUtil;
	@Autowired 
	MessageService messageService;
	
	private static List<Queue> queues = new ArrayList<Queue>();
	private static Map<String,Queue> queueMap = new LinkedHashMap<>();
	
	public boolean addQueue(QueueModel queue) {
		String queueId = UUID.randomUUID().toString();
		Queue dbQueue = new Queue(queue.getName(), queueId);
		if(dataUtil.addQueue(queueId)) {
			queueMap.put(queueId,dbQueue);
			queues.add(dbQueue);
			//MessageService.messageMap.putIfAbsent(queueId,new ConcurrentLinkedQueue<Message>())
			return true;
		}
		else {
			return false;
		}
	}
	
	public void deleteQueue(String id) {
		queueMap.remove(id);
		DataUtil.messageMap.remove(id);
	}
	
	public List<Queue> getAllQueues() {	
		List<Queue> response = new ArrayList<>();
		response.addAll(queueMap.values());
		return response;
	}
	
}
