package com.chen.sf.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.chen.sf.model.Resource;
import com.chen.sf.model.Task;
import com.chen.sf.model.TaskResource;
import com.chen.sf.service.ResourceService;
import com.chen.sf.service.TaskResourceService;
import com.chen.sf.service.TaskService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:configs/spring.xml" })
public class TestTask {

	@Autowired
	private TaskService taskService;

	@Autowired
	private ResourceService resourceService;

	@Autowired TaskResourceService taskResourceService;

	
	@Test
	public void testTaskService() {
		Task t = taskService.getTaskByID(1);
		System.out.println(JSON.toJSONString(t));

		Resource r = resourceService.getResourceByID(1);
		System.out.println(JSON.toJSONString(r));

	}

	@Test
	public void createTask() {

		Task newT = new Task();
		newT.setName("肉末豌豆");
		newT.setOwnerid(1);

		Integer newTID = taskService.createTask(newT);

		Resource newR = new Resource();
		newR.setName("豌豆");

		Integer newRID = resourceService.createResource(newR);

		TaskResource newTR = new TaskResource();
		newTR.setTid(newTID);
		newTR.setRid(newRID);

		taskResourceService.createRow(newTR);

		newTR.setRid(1);
		taskResourceService.createRow(newTR);
	}

}
