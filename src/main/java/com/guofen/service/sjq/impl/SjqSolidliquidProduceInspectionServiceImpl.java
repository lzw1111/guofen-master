package com.guofen.service.sjq.impl;

import com.guofen.dao.SjqSolidliquidProduceInspectionMapper;
import com.guofen.pojo.SjqSolidliquidProduceInspection;
import com.guofen.service.sjq.SjqSolidliquidProduceInspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class SjqSolidliquidProduceInspectionServiceImpl implements SjqSolidliquidProduceInspectionService {
    @Autowired
    SjqSolidliquidProduceInspectionMapper sjqSolidliquidProduceInspectionMapper;

    @Override
    public boolean add(String equipment_id,String operator,String Inspector,String remark){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(now);

        SjqSolidliquidProduceInspection sjqSolidliquidProduceInspection = new SjqSolidliquidProduceInspection();
        sjqSolidliquidProduceInspection.setDate(date);
        sjqSolidliquidProduceInspection.setEquipmentId(Integer.parseInt(equipment_id));
        sjqSolidliquidProduceInspection.setOperator(operator);
        sjqSolidliquidProduceInspection.setInspector(Inspector);
        sjqSolidliquidProduceInspection.setRemarks(remark);

        int result = sjqSolidliquidProduceInspectionMapper.insert(sjqSolidliquidProduceInspection);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public boolean update(String id,String Inspector,String remark){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(now);

        SjqSolidliquidProduceInspection sjqSolidliquidProduceInspection = new SjqSolidliquidProduceInspection();
        sjqSolidliquidProduceInspection.setId(Integer.parseInt(id));
        sjqSolidliquidProduceInspection.setDate(date);//设置最新还是安旧的来
        sjqSolidliquidProduceInspection.setEquipmentId(null);
        sjqSolidliquidProduceInspection.setOperator(null);
        sjqSolidliquidProduceInspection.setInspector(Inspector);
        sjqSolidliquidProduceInspection.setRemarks(remark);

        int result = sjqSolidliquidProduceInspectionMapper.updateByPrimaryKeySelective(sjqSolidliquidProduceInspection);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public SjqSolidliquidProduceInspection getlast_day(){
        return sjqSolidliquidProduceInspectionMapper.getLast();
    }

    @Override
    public SjqSolidliquidProduceInspection getlast_week(Integer equipment_id){
        return sjqSolidliquidProduceInspectionMapper.getLastWeek(equipment_id);
    }


}
