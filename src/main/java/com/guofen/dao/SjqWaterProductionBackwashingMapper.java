package com.guofen.dao;

import com.guofen.pojo.SjqWaterProductionBackwashing;

public interface SjqWaterProductionBackwashingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SjqWaterProductionBackwashing record);

    int insertSelective(SjqWaterProductionBackwashing record);

    SjqWaterProductionBackwashing selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SjqWaterProductionBackwashing record);

    int updateByPrimaryKey(SjqWaterProductionBackwashing record);
}