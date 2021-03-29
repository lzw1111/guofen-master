package com.guofen.dao;

import com.guofen.pojo.SjqWaterProductionEquipmentMaintenanceDay;

public interface SjqWaterProductionEquipmentMaintenanceDayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SjqWaterProductionEquipmentMaintenanceDay record);

    int insertSelective(SjqWaterProductionEquipmentMaintenanceDay record);

    SjqWaterProductionEquipmentMaintenanceDay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SjqWaterProductionEquipmentMaintenanceDay record);

    int updateByPrimaryKey(SjqWaterProductionEquipmentMaintenanceDay record);
}