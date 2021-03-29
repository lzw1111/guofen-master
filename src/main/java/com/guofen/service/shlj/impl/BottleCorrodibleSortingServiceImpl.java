package com.guofen.service.shlj.impl;

import com.guofen.dao.ShljAbnormalGarbageMapper;
import com.guofen.dao.ShljBottleCorrodibleSortingStatisticMapper;
import com.guofen.pojo.ShljAbnormalGarbage;
import com.guofen.pojo.ShljBlockageCleaning;
import com.guofen.pojo.ShljBottleCorrodibleSortingStatistic;
import com.guofen.service.shlj.BottleCorrodibleSortingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class BottleCorrodibleSortingServiceImpl implements BottleCorrodibleSortingService {

    @Autowired
    private ShljBottleCorrodibleSortingStatisticMapper shljBottleCorrodibleSortingStatisticMapper;

    @Override
    public boolean addForm(Double weight, String operator, String remarks) {
        //获取当前日期
        Date now=new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(now);
        System.out.println(date);

        ShljBottleCorrodibleSortingStatistic shljBottleCorrodibleSortingStatistic = new ShljBottleCorrodibleSortingStatistic();
        shljBottleCorrodibleSortingStatistic.setDate(date);
        shljBottleCorrodibleSortingStatistic.setWeight(weight);
        shljBottleCorrodibleSortingStatistic.setOperator(operator);
        shljBottleCorrodibleSortingStatistic.setRemarks(remarks);
        int result = shljBottleCorrodibleSortingStatisticMapper.insert(shljBottleCorrodibleSortingStatistic);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public ShljBottleCorrodibleSortingStatistic findForm() {
        //获取当前日期
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(now);
        System.out.println("当前日期" + date);
        //获取最新记录
        ShljBottleCorrodibleSortingStatistic shljBottleCorrodibleSortingStatistic = shljBottleCorrodibleSortingStatisticMapper.findLast();
        System.out.println("最新记录" + shljBottleCorrodibleSortingStatisticMapper.findLast());
        //获取最新记录日期
        String dateLast =  shljBottleCorrodibleSortingStatistic.getDate();
        System.out.println("最新记录日期" + dateLast);

        if (date.equals(dateLast))
            return shljBottleCorrodibleSortingStatistic;
        else
            return null;
    }
}
