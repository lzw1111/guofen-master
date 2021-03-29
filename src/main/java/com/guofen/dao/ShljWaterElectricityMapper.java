package com.guofen.dao;

import com.guofen.pojo.ShljWaterElectricity;

public interface ShljWaterElectricityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShljWaterElectricity record);

    int insertSelective(ShljWaterElectricity record);

    ShljWaterElectricity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShljWaterElectricity record);

    int updateByPrimaryKey(ShljWaterElectricity record);
}