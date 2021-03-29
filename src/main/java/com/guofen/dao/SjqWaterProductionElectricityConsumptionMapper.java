package com.guofen.dao;

import com.guofen.pojo.SjqWaterProductionElectricityConsumption;

public interface SjqWaterProductionElectricityConsumptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SjqWaterProductionElectricityConsumption record);

    int insertSelective(SjqWaterProductionElectricityConsumption record);

    SjqWaterProductionElectricityConsumption selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SjqWaterProductionElectricityConsumption record);

    int updateByPrimaryKey(SjqWaterProductionElectricityConsumption record);
}