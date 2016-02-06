package com.chen.sf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chen.sf.dao.ResourceMapper;
import com.chen.sf.model.Resource;

@Service
public class ResourceService {

	@Autowired
	private ResourceMapper resourceMapper;

	public Resource getResourceByID (Integer rid) {
		return resourceMapper.selectByPrimaryKey(rid);
	}

	public Integer createResource (Resource record) {
		return resourceMapper.insert(record);
	}
}
