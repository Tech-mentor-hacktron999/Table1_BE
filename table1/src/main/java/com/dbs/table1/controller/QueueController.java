package com.dbs.table1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.table1.model.Queue;
import com.dbs.table1.service.QueueService;

@RestController
public class QueueController {

	@Autowired
	private QueueService queueService;

	@GetMapping("queue/")
<<<<<<< HEAD
	public List<Queue> getAllQueues(){
=======
	public List<Queue> getAllQueues() {
>>>>>>> 8aca5e234cb6151e6c0aea03e2bb028062a7c692
		List<Queue> list = queueService.getAllQueues();
		return list;
	}

	@DeleteMapping("queue/{id}")
	public void deleteQueue(@PathVariable("id") String id){
		queueService.deleteQueue(id);
	}

	@PostMapping("queue/add")
	public void addQueue(Queue queue){
		queueService.addQueue(queue);
	}

}
