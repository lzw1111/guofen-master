package com.guofen.dao;

import com.guofen.pojo.SjqWaterProductionDeliverWater;

public interface SjqWaterProductionDeliverWaterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SjqWaterProductionDeliverWater record);

    int insertSelective(SjqWaterProductionDeliverWater record);

    SjqWaterProductionDeliverWater selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SjqWaterProductionDeliverWater record);

    int updateByPrimaryKey(SjqWaterProductionDeliverWater record);
}