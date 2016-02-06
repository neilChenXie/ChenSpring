package com.chen.sf.dao;

import com.chen.sf.model.Resource;

public interface ResourceMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Resource record);

    int insertSelective(Resource record);

    Resource selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Resource record);

    int updateByPrimaryKey(Resource record);
}