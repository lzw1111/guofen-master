package com.guofen.dao;

import com.guofen.pojo.SjqWaterProcess;

public interface SjqWaterProcessMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SjqWaterProcess record);

    int insertSelective(SjqWaterProcess record);

    SjqWaterProcess selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SjqWaterProcess record);

    int updateByPrimaryKey(SjqWaterProcess record);
}