package com.dbs.table1.service;

import java.util.ArrayList;
import java.util.List;

import com.dbs.table1.model.Queue;

public class QueueService {
	
	private static List<Queue> queues = new ArrayList<Queue>();
	
	public boolean addQueue(Queue queue)
	{
		queues.add(queue);
		return true;
		
	}
	
	public boolean deleteQueue(String id)
	{
		queues.remove(id);
		return true;
		
	}
	
	public List<Queue> getAllQueues()
	{
		return queues;
	}
	
}
