package com.guofen.dao;

import com.guofen.pojo.ShljStorageBoxClean;

public interface ShljStorageBoxCleanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShljStorageBoxClean record);

    int insertSelective(ShljStorageBoxClean record);

    ShljStorageBoxClean selectByPrimaryKey(Integer id);

    ShljStorageBoxClean getLast();

    int updateByPrimaryKeySelective(ShljStorageBoxClean record);

    int updateByPrimaryKey(ShljStorageBoxClean record);
}