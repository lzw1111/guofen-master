package com.guofen.dao;

import com.guofen.pojo.ShljElectricityMeter;

public interface ShljElectricityMeterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShljElectricityMeter record);

    int insertSelective(ShljElectricityMeter record);

    ShljElectricityMeter selectByPrimaryKey(Integer id);

    ShljElectricityMeter getLast();

    int updateByPrimaryKeySelective(ShljElectricityMeter record);

    int updateByPrimaryKey(ShljElectricityMeter record);
}