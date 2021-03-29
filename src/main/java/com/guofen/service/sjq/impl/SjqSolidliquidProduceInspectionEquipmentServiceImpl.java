package com.guofen.service.sjq.impl;

import com.guofen.dao.SjqSolidliquidProduceInspectionEquipmentMapper;
import com.guofen.pojo.SjqSolidliquidProduceInspectionEquipment;
import com.guofen.service.sjq.SjqSolidliquidProduceInspectionEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class SjqSolidliquidProduceInspectionEquipmentServiceImpl implements SjqSolidliquidProduceInspectionEquipmentService {
    @Autowired
    SjqSolidliquidProduceInspectionEquipmentMapper sjqSolidliquidProduceInspectionEquipmentMapper;

    @Override
    public boolean add(String name,String detail,Boolean isNormal){
        SjqSolidliquidProduceInspectionEquipment sjqSolidliquidProduceInspectionEquipment = new SjqSolidliquidProduceInspectionEquipment();
        sjqSolidliquidProduceInspectionEquipment.setDetail(detail);
        sjqSolidliquidProduceInspectionEquipment.setName(name);
        sjqSolidliquidProduceInspectionEquipment.setIsNormal(isNormal);
        System.out.println(detail+"  "+name);
        int result = sjqSolidliquidProduceInspectionEquipmentMapper.insert(sjqSolidliquidProduceInspectionEquipment);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public SjqSolidliquidProduceInspectionEquipment selectByPrimaryKey(Integer key){
        return sjqSolidliquidProduceInspectionEquipmentMapper.selectByPrimaryKey(key);
    }

    @Override
    public List<SjqSolidliquidProduceInspectionEquipment> getlist(){
        return sjqSolidliquidProduceInspectionEquipmentMapper.getlist();
    }

}
