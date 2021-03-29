package com.guofen.service.shlj.impl;

import com.guofen.dao.ShljAbnormalGarbageMapper;
import com.guofen.pojo.ShljAbnormalGarbage;
import com.guofen.service.shlj.AbnormalGarbageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AbnormalGarbageServiceImpl implements AbnormalGarbageService {

    @Autowired
    private ShljAbnormalGarbageMapper shljAbnormalGarbageMapper;

    @Override
    public boolean addForm(String wagon_number, String garbage_source, String garbage_type, Integer garbage_number, String recording_person, String remarks) {
        //获取当前日期
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(now);
        System.out.println(date);

        ShljAbnormalGarbage shljAbnormalGarbage = new ShljAbnormalGarbage();
        shljAbnormalGarbage.setDate(date);
        shljAbnormalGarbage.setWagonNumber(wagon_number);
        shljAbnormalGarbage.setGarbageSource(garbage_source);
        shljAbnormalGarbage.setGarbageType(garbage_type);
        shljAbnormalGarbage.setGarbageNumber(garbage_number);
//        shljAbnormalGarbage.setGarbageUnit(garbage_unit);
        shljAbnormalGarbage.setRecordingPerson(recording_person);
        shljAbnormalGarbage.setRemarks(remarks);
        int result = shljAbnormalGarbageMapper.insert(shljAbnormalGarbage);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public ShljAbnormalGarbage findForm() {
        //获取当前日期
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(now);
        System.out.println("当前日期" + date);
        //获取最新记录
        ShljAbnormalGarbage shljAbnormalGarbage = shljAbnormalGarbageMapper.findLast();
        System.out.println("最新记录" + shljAbnormalGarbageMapper.findLast());
        //获取最新记录日期
        String dateLast =  shljAbnormalGarbage.getDate();
        System.out.println("最新记录日期" + dateLast);

        if (date.equals(dateLast))
            return shljAbnormalGarbage;
        else
            return null;
    }
}
