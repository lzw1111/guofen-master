package com.guofen.service.sjq.impl;

import com.guofen.dao.SjqOverhaulMapper;
import com.guofen.pojo.SjqDeodorizationCraft;
import com.guofen.pojo.SjqOverhaul;
import com.guofen.service.sjq.OverhaulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class OverhaulServiceImpl implements OverhaulService {

    @Autowired
    private SjqOverhaulMapper sjqOverhaulMapper;

    @Override
    public boolean addForm(String equipment_name, String start_time, String end_time, String person_incharge, String process) {
        //获取当前日期
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(now);
        System.out.println(date);

        SjqOverhaul sjqOverhaul = new SjqOverhaul();
        sjqOverhaul.setDate(date);
        sjqOverhaul.setEquipmentName(equipment_name);
        sjqOverhaul.setStartTime(start_time);
        sjqOverhaul.setEndTime(end_time);
        sjqOverhaul.setPersonIncharge(person_incharge);
        sjqOverhaul.setProcess(process);

        int result = sjqOverhaulMapper.insert(sjqOverhaul);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public SjqOverhaul findForm() {
        //获取当前日期
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(now);
        System.out.println("当前日期" + date);
        //获取最新记录
        SjqOverhaul sjqOverhaul = sjqOverhaulMapper.findLast();
        System.out.println("最新记录" + sjqOverhaulMapper.findLast());
        //获取最新记录日期
        String dateLast =  sjqOverhaul.getDate();
        System.out.println("最新记录日期" + dateLast);

        if (date.equals(dateLast))
            return sjqOverhaul;
        else
            return null;
    }
}
