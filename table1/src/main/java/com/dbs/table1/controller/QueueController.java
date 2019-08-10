package com.dbs.table1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.table1.model.Queue;
import com.dbs.table1.model.QueueModel;
import com.dbs.table1.service.QueueService;

@RestController
@RequestMapping("/queue")
public class QueueController {

	@Autowired
	private QueueService queueService;

	@GetMapping("/")
	public List<Queue> getAllQueues() {
		List<Queue> list = queueService.getAllQueues();
		return list;
	}

	@DeleteMapping("/{id}")
	public void deleteQueue(@PathVariable("id") String id){
		queueService.deleteQueue(id);
	}

	@PostMapping(value = "/add")
	public void addQueue(@RequestBody QueueModel queue){
		queueService.addQueue(queue);
	}

}
