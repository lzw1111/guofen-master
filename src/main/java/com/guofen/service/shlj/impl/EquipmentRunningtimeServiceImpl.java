package com.guofen.service.shlj.impl;

import com.guofen.pojo.ShljDeodorizationtowerWaterChange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guofen.service.shlj.EquipmentRunningtimeService;
import com.guofen.dao.ShljEquipmentRunningtimeMapper;
import com.guofen.pojo.ShljEquipmentRunningtime;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class EquipmentRunningtimeServiceImpl implements EquipmentRunningtimeService{
    @Autowired
    private ShljEquipmentRunningtimeMapper shljEquipmentRunningtimeMapper;

    @Override
    public boolean addStartupTime(String startupTime) {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(now);

        ShljEquipmentRunningtime shljEquipmentRunningtime = new ShljEquipmentRunningtime();
        shljEquipmentRunningtime.setDate(date);
        shljEquipmentRunningtime.setStartupTime(startupTime);
        int result = shljEquipmentRunningtimeMapper.insert(shljEquipmentRunningtime);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public boolean addShutdownTime(String shutdownTime, String shutdownReasion) {
        ShljEquipmentRunningtime shljEquipmentRunningtime = shljEquipmentRunningtimeMapper.selectLast();
        System.out.println("最新记录："+ shljEquipmentRunningtime);
        shljEquipmentRunningtime.setShutdownTime(shutdownTime);
        shljEquipmentRunningtime.setShutdownReasion(shutdownReasion);
        int result = shljEquipmentRunningtimeMapper.updateByPrimaryKeySelective(shljEquipmentRunningtime);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public ShljEquipmentRunningtime findForm() {
        //获取当前日期
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(now);
        System.out.println("当前日期" + date);
        //获取最新记录
        ShljEquipmentRunningtime shljEquipmentRunningtime = shljEquipmentRunningtimeMapper.findLast();
        System.out.println("最新记录" + shljEquipmentRunningtimeMapper.findLast());
        //获取最新记录日期
        String dateLast =  shljEquipmentRunningtime.getDate();
        System.out.println("最新记录日期" + dateLast);

        if (date.equals(dateLast))
            return shljEquipmentRunningtime;
        else
            return null;
    }
}