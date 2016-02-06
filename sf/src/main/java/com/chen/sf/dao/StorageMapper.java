package com.chen.sf.dao;

import com.chen.sf.model.Storage;

public interface StorageMapper {
    int insert(Storage record);

    int insertSelective(Storage record);
}