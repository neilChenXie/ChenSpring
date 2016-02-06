package com.chen.sf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chen.sf.dao.TaskResourceMapper;
import com.chen.sf.model.TaskResource;

@Service
public class TaskResourceService {

	@Autowired
	private TaskResourceMapper taskResourceMapper;

	public Integer createRow(TaskResource record) {
		return taskResourceMapper.insert(record);
	}
}
