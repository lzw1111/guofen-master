package com.guofen.dao;

import com.guofen.pojo.ShljWaterMeter;

public interface ShljWaterMeterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShljWaterMeter record);

    int insertSelective(ShljWaterMeter record);

    ShljWaterMeter selectByPrimaryKey(Integer id);

    ShljWaterMeter getLast();

    int updateByPrimaryKeySelective(ShljWaterMeter record);

    int updateByPrimaryKey(ShljWaterMeter record);
}