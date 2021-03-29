package com.guofen.service.sjq.impl;

import com.guofen.dao.SjqDeodorizationCraftMapper;
import com.guofen.pojo.SjqDeodorizationCraft;
import com.guofen.service.sjq.DeodorizationCraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class DeodorizationCraftServiceImpl implements DeodorizationCraftService {

    @Autowired
    private SjqDeodorizationCraftMapper sjqDeodorizationCraftMapper;

    @Override
    public boolean addForm(Double dungWeight, Double solidliquidWeight, Double flocculationWeight, Double compostWeight, Double outdoorWeight, Double enzymeWeight, Double othersWeight, String remarks) {
        //获取当前日期
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(now);
        System.out.println(date);

        SjqDeodorizationCraft sjqDeodorizationCraft = new SjqDeodorizationCraft();
        sjqDeodorizationCraft.setDate(date);
        sjqDeodorizationCraft.setDungWeight(dungWeight);
        sjqDeodorizationCraft.setSolidliquidWeight(solidliquidWeight);
        sjqDeodorizationCraft.setFlocculationWeight(flocculationWeight);
        sjqDeodorizationCraft.setCompostWeight(compostWeight);
        sjqDeodorizationCraft.setOutdoorWeight(outdoorWeight);
        sjqDeodorizationCraft.setEnzymeWeight(enzymeWeight);
        sjqDeodorizationCraft.setOthersWeight(othersWeight);
        sjqDeodorizationCraft.setRemarks(remarks);
        int result = sjqDeodorizationCraftMapper.insert(sjqDeodorizationCraft);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public SjqDeodorizationCraft findForm() {
        //获取当前日期
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(now);
        System.out.println("当前日期" + date);
        //获取最新记录
        SjqDeodorizationCraft sjqDeodorizationCraft = sjqDeodorizationCraftMapper.findLast();
        System.out.println("最新记录" + sjqDeodorizationCraftMapper.findLast());
        //获取最新记录日期
        String dateLast =  sjqDeodorizationCraft.getDate();
        System.out.println("最新记录日期" + dateLast);

        if (date.equals(dateLast))
            return sjqDeodorizationCraft;
        else
            return null;
    }
}