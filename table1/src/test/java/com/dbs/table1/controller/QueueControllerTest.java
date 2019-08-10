package com.dbs.table1.controller;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dbs.table1.model.Queue;
import com.dbs.table1.service.QueueService;

public class QueueControllerTest {
	
	private QueueService queueService;
	
	@Before
	public void setUp(){
		queueService = new QueueService();	
	}
	@Test
	public List<Queue> getAllQueuesTest() {
		List<Queue> list = queueService.getAllQueues();
		return list;
	}

	@Test
	public void deleteQueueTest(){
		assertEquals(queueService.deleteQueue("1"), true);
	}

	@Test
	public void addQueueTest(Queue queue){
		assertEquals(queueService.addQueue(queue), true);
	}
	
	@After
	public void tearDown(){
		queueService = null;
	}
}
