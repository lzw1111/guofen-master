package com.guofen.service.shlj;

import com.guofen.pojo.ShljEquipmentMaintenance;

public interface EquipmentMaintenanceService{
    //增
    boolean add(String equipmentName,
                String operator,
                String method,
                String examiner,
                String result,
                String remarks);

    boolean update(Integer id,
                String equipmentName,
                String operator,
                String method,
                String examiner,
                String result,
                String remarks);

    ShljEquipmentMaintenance get(Integer id);

    ShljEquipmentMaintenance getlast();

    ShljEquipmentMaintenance getlatest(String equipmentsName,String maintenanceContent);
}