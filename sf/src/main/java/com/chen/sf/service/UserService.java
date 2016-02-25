package com.chen.sf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chen.sf.dao.UserMapper;
import com.chen.sf.model.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public User getUserByUsername(String name) {
		return userMapper.selectByUsername(name);
	}

}
