package com.chen.sf.dao;

import com.chen.sf.model.UserTask;

public interface UserTaskMapper {
    int insert(UserTask record);

    int insertSelective(UserTask record);
}