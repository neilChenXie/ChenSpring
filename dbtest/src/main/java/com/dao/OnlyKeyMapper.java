package com.dao;

import java.util.List;

import com.model.OnlyKey;

public interface OnlyKeyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OnlyKey record);

    int insertSelective(OnlyKey record);

    OnlyKey selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OnlyKey record);

    int updateByPrimaryKey(OnlyKey record);

	List<OnlyKey> selectAll();
}
