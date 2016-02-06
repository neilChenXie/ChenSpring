package com.chen.sf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chen.sf.dao.TaskMapper;
import com.chen.sf.model.Task;

@Service
public class TaskService {

	@Autowired
	private TaskMapper taskMapper;

	public Task getTaskByID (Integer tid) {
		return taskMapper.selectByPrimaryKey(tid);
	}

	public int createTask (Task newTask) {
		return taskMapper.insert(newTask);
	}

}
