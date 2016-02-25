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
import com.chen.sf.model.User;
import com.chen.sf.service.ResourceService;
import com.chen.sf.service.TaskResourceService;
import com.chen.sf.service.TaskService;
import com.chen.sf.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:configs/spring.xml" })
public class TestTask {

	@Autowired
	private TaskService taskService;

	@Autowired
	private ResourceService resourceService;

	@Autowired
	private UserService userService;

	@Autowired TaskResourceService taskResourceService;

	
	@Test
	public void testTaskService() {
		Task t = taskService.getTaskByID(1);
		System.out.println(JSON.toJSONString(t));

		Resource r = resourceService.getResourceByID(1);
		System.out.println(JSON.toJSONString(r));

	}

	@Test
	public void testUserService() {
		User u = userService.getUserByUsername("kilne");
		System.out.println(JSON.toJSONString(u));
	}

}
