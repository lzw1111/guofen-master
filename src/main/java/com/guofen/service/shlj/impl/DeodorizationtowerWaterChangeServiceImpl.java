package com.guofen.service.shlj.impl;

import com.guofen.dao.ShljDeodorizationtowerWaterChangeMapper;
import com.guofen.pojo.ShljDeodorantSprayingtime;
import com.guofen.pojo.ShljDeodorizationtowerWaterChange;
import com.guofen.service.shlj.DeodorizationtowerWaterChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class DeodorizationtowerWaterChangeServiceImpl implements DeodorizationtowerWaterChangeService {
    @Autowired
    private ShljDeodorizationtowerWaterChangeMapper shljDeodorizationtowerWaterChangeMapper;

    //开始放水
    @Override
    public boolean beginReducingWater(String water_reduce_time, String recording_person) {
        //获取当前日期
        Date now=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(now);
        System.out.println(date);

        ShljDeodorizationtowerWaterChange shljDeodorizationtowerWaterChange = new ShljDeodorizationtowerWaterChange();
        shljDeodorizationtowerWaterChange.setDate(date);
        shljDeodorizationtowerWaterChange.setWaterReduceTime(water_reduce_time);
        shljDeodorizationtowerWaterChange.setRecordingPerson(recording_person);
        int result = shljDeodorizationtowerWaterChangeMapper.insert(shljDeodorizationtowerWaterChange);
        if (result == 1)
            return true;
        else
            return false;
    }

    //开始加水
    @Override
    public boolean beginAddingWater(String water_add_time, Double deodorant, Double freshener) {
        ShljDeodorizationtowerWaterChange shljDeodorizationtowerWaterChange = shljDeodorizationtowerWaterChangeMapper.selectLast();
        System.out.println("最新记录："+ shljDeodorizationtowerWaterChange);
        shljDeodorizationtowerWaterChange.setWaterAddTime(water_add_time);
        shljDeodorizationtowerWaterChange.setDeodorant(deodorant);
        shljDeodorizationtowerWaterChange.setFreshener(freshener);
        int result = shljDeodorizationtowerWaterChangeMapper.updateByPrimaryKeySelective(shljDeodorizationtowerWaterChange);
        if (result == 1)
            return true;
        else
            return false;
    }

    //开始清理填料
    @Override
    public boolean beginCleaningStuffing(String clean_filler_time, Integer clean_nozzle_number) {
        ShljDeodorizationtowerWaterChange shljDeodorizationtowerWaterChange = shljDeodorizationtowerWaterChangeMapper.selectLast();
        System.out.println("最新记录："+ shljDeodorizationtowerWaterChange);
        shljDeodorizationtowerWaterChange.setCleanFillerTime(clean_filler_time);
        shljDeodorizationtowerWaterChange.setCleanNozzleNumber(clean_nozzle_number);
        int result = shljDeodorizationtowerWaterChangeMapper.updateByPrimaryKeySelective(shljDeodorizationtowerWaterChange);
        if (result == 1)
            return true;
        else
            return false;
    }

    //保存备注
    @Override
    public boolean add(String remarks) {
        ShljDeodorizationtowerWaterChange shljDeodorizationtowerWaterChange = shljDeodorizationtowerWaterChangeMapper.selectLast();
        System.out.println("最新记录："+ shljDeodorizationtowerWaterChange);
        shljDeodorizationtowerWaterChange.setRemarks(remarks);
        int result = shljDeodorizationtowerWaterChangeMapper.updateByPrimaryKeySelective(shljDeodorizationtowerWaterChange);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public ShljDeodorizationtowerWaterChange findForm() {
        //获取当前日期
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(now);
        System.out.println("当前日期" + date);
        //获取最新记录
        ShljDeodorizationtowerWaterChange shljDeodorizationtowerWaterChange = shljDeodorizationtowerWaterChangeMapper.findLast();
        System.out.println("最新记录" + shljDeodorizationtowerWaterChangeMapper.findLast());
        //获取最新记录日期
        String dateLast =  shljDeodorizationtowerWaterChange.getDate();
        System.out.println("最新记录日期" + dateLast);

        if (date.equals(dateLast))
            return shljDeodorizationtowerWaterChange;
        else
            return null;
    }
}
