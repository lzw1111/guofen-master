package com.guofen.dao;

import com.guofen.pojo.SjqWaterProductionEquipmentInspection;

public interface SjqWaterProductionEquipmentInspectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SjqWaterProductionEquipmentInspection record);

    int insertSelective(SjqWaterProductionEquipmentInspection record);

    SjqWaterProductionEquipmentInspection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SjqWaterProductionEquipmentInspection record);

    int updateByPrimaryKey(SjqWaterProductionEquipmentInspection record);
}