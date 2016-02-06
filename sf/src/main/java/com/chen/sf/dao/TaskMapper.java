package com.chen.sf.dao;

import com.chen.sf.model.Task;

public interface TaskMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Task record);

    int insertSelective(Task record);

    Task selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Task record);

    int updateByPrimaryKey(Task record);
}