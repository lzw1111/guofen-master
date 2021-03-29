package com.guofen.service.shlj.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guofen.service.shlj.EquipmentMaintenanceService;
import com.guofen.dao.ShljEquipmentMaintenanceMapper;
import com.guofen.pojo.ShljEquipmentMaintenance;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class EquipmentMaintenanceServiceImpl implements EquipmentMaintenanceService{
    @Autowired
    private ShljEquipmentMaintenanceMapper shljEquipmentMaintenanceMapper;

    @Override
    public boolean add(String equipmentName,
                       String operator,
                       String method,
                       String examiner,
                       String res,
                       String remarks){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(now);
        SimpleDateFormat dayFormat = new SimpleDateFormat("MM/dd");
        String day = dayFormat.format(now);
        SimpleDateFormat weekFm = new SimpleDateFormat("EEEE", Locale.CHINA);
        String week = weekFm.format(now);

        ShljEquipmentMaintenance shljEquipmentMaintenance = new ShljEquipmentMaintenance();
        shljEquipmentMaintenance.setDate(date);
        shljEquipmentMaintenance.setEquipmentName(equipmentName);
        shljEquipmentMaintenance.setMaintenanceContent("");//废弃之后删
        shljEquipmentMaintenance.setPlanAintenanceWeek("周日");
        shljEquipmentMaintenance.setActualAintenanceWeek(week);
        shljEquipmentMaintenance.setActualAintenanceDay(day);
        shljEquipmentMaintenance.setOperator(operator);
        shljEquipmentMaintenance.setMethod(method);
        shljEquipmentMaintenance.setExaminer(examiner);
        shljEquipmentMaintenance.setResult(res);
        shljEquipmentMaintenance.setRemarks(remarks);

        int result = shljEquipmentMaintenanceMapper.insert(shljEquipmentMaintenance);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public boolean update(Integer id,
                       String equipmentName,
                       String operator,
                       String method,
                       String examiner,
                       String res,
                       String remarks){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(now);
        SimpleDateFormat dayFormat = new SimpleDateFormat("MM/dd");
        String day = dayFormat.format(now);

        SimpleDateFormat weekFm = new SimpleDateFormat("EEEE", Locale.CHINA);
        String week = weekFm.format(now);


        ShljEquipmentMaintenance shljEquipmentMaintenance = new ShljEquipmentMaintenance();
        shljEquipmentMaintenance.setId(id);
        shljEquipmentMaintenance.setDate(date);
        shljEquipmentMaintenance.setEquipmentName(equipmentName);
        shljEquipmentMaintenance.setMaintenanceContent("");//废弃之后删
        shljEquipmentMaintenance.setPlanAintenanceWeek("周日");
        shljEquipmentMaintenance.setActualAintenanceWeek(week);
        shljEquipmentMaintenance.setActualAintenanceDay(day);
        shljEquipmentMaintenance.setOperator(operator);
        shljEquipmentMaintenance.setMethod(method);
        shljEquipmentMaintenance.setExaminer(examiner);
        shljEquipmentMaintenance.setResult(res);
        shljEquipmentMaintenance.setRemarks(remarks);

        int result = shljEquipmentMaintenanceMapper.updateByPrimaryKeySelective(shljEquipmentMaintenance);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public ShljEquipmentMaintenance get(Integer id){
        return shljEquipmentMaintenanceMapper.selectByPrimaryKey(id);
    }

    @Override
    public ShljEquipmentMaintenance getlatest(String equipmentName,String maintenanceContent){
        Map<String, Object> data = new HashMap<>();
        data.put("equipmentsName", equipmentName);
        data.put("maintenanceContent", maintenanceContent);
        return shljEquipmentMaintenanceMapper.selectLatest(data);
    }

    @Override
    public ShljEquipmentMaintenance getlast(){
        return shljEquipmentMaintenanceMapper.getLast();
    }
}