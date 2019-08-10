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
		Queue temp = null;
		for(Queue queue : queues)
		{
			if(queue.getId().equalsIgnoreCase(id))
			{
				temp = queue;
				break;
			}
				
		}
		
		if(temp==null)
		return false;
		else
		{
			queues.remove(temp);
			return true;
		}		
	}
	
	public List<Queue> getAllQueues()
	{
		return queues;
	}
	
}
