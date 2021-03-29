package com.guofen.dao;

import com.guofen.pojo.SjqWaterProductionEquipmentMaintenanceMonth;

public interface SjqWaterProductionEquipmentMaintenanceMonthMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SjqWaterProductionEquipmentMaintenanceMonth record);

    int insertSelective(SjqWaterProductionEquipmentMaintenanceMonth record);

    SjqWaterProductionEquipmentMaintenanceMonth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SjqWaterProductionEquipmentMaintenanceMonth record);

    int updateByPrimaryKey(SjqWaterProductionEquipmentMaintenanceMonth record);
}