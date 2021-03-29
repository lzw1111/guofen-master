package com.guofen.dao;

import com.guofen.pojo.SjqWaterProductionEquipmentRunning;

public interface SjqWaterProductionEquipmentRunningMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SjqWaterProductionEquipmentRunning record);

    int insertSelective(SjqWaterProductionEquipmentRunning record);

    SjqWaterProductionEquipmentRunning selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SjqWaterProductionEquipmentRunning record);

    int updateByPrimaryKey(SjqWaterProductionEquipmentRunning record);
}