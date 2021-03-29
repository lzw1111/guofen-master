package com.guofen.dao;

import com.guofen.pojo.ShljEquipmentMaintenance;

import java.util.List;
import java.util.Map;

public interface ShljEquipmentMaintenanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShljEquipmentMaintenance record);

    int insertSelective(ShljEquipmentMaintenance record);

    ShljEquipmentMaintenance selectByPrimaryKey(Integer id);

    ShljEquipmentMaintenance selectLatest(Map<String, Object> data);

    ShljEquipmentMaintenance getLast();

    int updateByPrimaryKeySelective(ShljEquipmentMaintenance record);

    int updateByPrimaryKey(ShljEquipmentMaintenance record);
}