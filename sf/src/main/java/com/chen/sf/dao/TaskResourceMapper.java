package com.chen.sf.dao;

import com.chen.sf.model.TaskResource;

public interface TaskResourceMapper {
    int insert(TaskResource record);

    int insertSelective(TaskResource record);
}