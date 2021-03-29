package com.guofen.dao;

import com.guofen.pojo.SjqWaterProductionFailure;

public interface SjqWaterProductionFailureMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SjqWaterProductionFailure record);

    int insertSelective(SjqWaterProductionFailure record);

    SjqWaterProductionFailure selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SjqWaterProductionFailure record);

    int updateByPrimaryKey(SjqWaterProductionFailure record);
}