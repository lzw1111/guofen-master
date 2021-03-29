package com.guofen.service.shlj.impl;

import com.guofen.dao.ShljDeodorantSprayingtimeMapper;
import com.guofen.pojo.ShljBottleCorrodibleSortingStatistic;
import com.guofen.pojo.ShljDeodorantSprayingtime;
import com.guofen.service.shlj.DeodorantSprayingtimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Service
public class DeodorantSprayingtimeServiceImpl implements DeodorantSprayingtimeService {
    @Autowired
    private ShljDeodorantSprayingtimeMapper shljDeodorantSprayingtimeMapper;

    @Override
    public boolean addForm(String time,String signature) {
        //获取当前日期
        Date dayNow = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(dayNow);
        System.out.println(date);
        //获取当天位星期几
        Date weekNow = new Date();
        SimpleDateFormat dateFm = new SimpleDateFormat("EEEE", Locale.CHINA);
        String week = dateFm.format(weekNow);
        System.out.println(week);

        ShljDeodorantSprayingtime shljDeodorantSprayingtime = new ShljDeodorantSprayingtime();
        shljDeodorantSprayingtime.setDate(date);
        shljDeodorantSprayingtime.setWeek(week);
        shljDeodorantSprayingtime.setTime(time);
        shljDeodorantSprayingtime.setSignature(signature);
        int result = shljDeodorantSprayingtimeMapper.insert(shljDeodorantSprayingtime);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public ShljDeodorantSprayingtime findForm() {
        //获取当前日期
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(now);
        System.out.println("当前日期" + date);
        //获取最新记录
        ShljDeodorantSprayingtime shljDeodorantSprayingtime = shljDeodorantSprayingtimeMapper.findLast();
        System.out.println("最新记录" + shljDeodorantSprayingtimeMapper.findLast());
        //获取最新记录日期
        String dateLast =  shljDeodorantSprayingtime.getDate();
        System.out.println("最新记录日期" + dateLast);

        if (date.equals(dateLast))
            return shljDeodorantSprayingtime;
        else
            return null;
    }
}
