package com.dbs.table1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.table1.model.Queue;
import com.dbs.table1.service.QueueService;

@RestController
public class QueueController {

@Autowired
private QueueService queueService;

List<Queue> list = new ArrayList<Queue>();

@GetMapping("queue/")
public List<Queue> getAllQueues(){
	return list;
}

@DeleteMapping("queue/{id}")
public void getQueues(@PathVariable("id") String id){
	
}

}
