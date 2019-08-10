package com.dbs.table1.service;

import java.util.ArrayList;
import java.util.List;
import com.dbs.table1.model.Queue;

public class QueueService {
	
	private static List<Queue> queues = new ArrayList<Queue>();
	
	DataUtil util = new DataUtil();
	public boolean addQueue(Queue queue)
	{
		if(util.addQueue(queue.getId()))
		{
		queues.add(queue);
		return true;
		}
		else
			return false;
		
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
