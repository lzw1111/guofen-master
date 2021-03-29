package com.guofen.service.shlj.impl;

import com.guofen.dao.ShljAbnormalGarbageMapper;
import com.guofen.dao.ShljBlockageCleaningMapper;
import com.guofen.pojo.ShljAbnormalGarbage;
import com.guofen.pojo.ShljBlockageCleaning;
import com.guofen.service.shlj.BlockageCleaningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class BlockageCleaningServiceImpl implements BlockageCleaningService {

    @Autowired
    private ShljBlockageCleaningMapper shljBlockageCleaningMapper;

    @Override
    public boolean addForm(String time,String blockage_position,String cleaning_person,String recording_person,String remarks) {
        //获取当前日期
        Date now=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(now);
        System.out.println(date);

        ShljBlockageCleaning shljBlockageCleaning = new ShljBlockageCleaning();
        shljBlockageCleaning.setDate(date);
        shljBlockageCleaning.setTime(time);
        shljBlockageCleaning.setBlockagePosition(blockage_position);
        shljBlockageCleaning.setCleaningPerson(cleaning_person);
        shljBlockageCleaning.setRecordingPerson(recording_person);
        shljBlockageCleaning.setRemarks(remarks);
        int result = shljBlockageCleaningMapper.insert(shljBlockageCleaning);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public ShljBlockageCleaning findForm() {
        //获取当前日期
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(now);
        System.out.println("当前日期" + date);
        //获取最新记录
        ShljBlockageCleaning shljBlockageCleaning = shljBlockageCleaningMapper.findLast();
        System.out.println("最新记录" + shljBlockageCleaningMapper.findLast());
        //获取最新记录日期
        String dateLast =  shljBlockageCleaning.getDate();
        System.out.println("最新记录日期" + dateLast);

        if (date.equals(dateLast))
            return shljBlockageCleaning;
        else
            return null;
    }
}
