package com.guofen.service.sjq.impl;

import com.guofen.dao.SjqSolidliquidProduceElectricityMapper;
import com.guofen.pojo.SjqSolidliquidProduceElectricity;
import com.guofen.service.sjq.SjqSolidliquidProduceElectricityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class SjqSolidliquidProduceElectricityServiceImpl implements SjqSolidliquidProduceElectricityService {
    @Autowired
    SjqSolidliquidProduceElectricityMapper sjqSolidliquidProduceElectricityMapper;

    @Override
    public boolean add(String reading,String reader,String remarks){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(now);
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String eReadingTime = timeFormat.format(now);

        SjqSolidliquidProduceElectricity sjqSolidliquidProduceElectricity = new SjqSolidliquidProduceElectricity();
        sjqSolidliquidProduceElectricity.setDate(date);
        sjqSolidliquidProduceElectricity.setReadingTime(eReadingTime);
        sjqSolidliquidProduceElectricity.setReading(Double.parseDouble(reading));
        sjqSolidliquidProduceElectricity.setReader(reader);
        sjqSolidliquidProduceElectricity.setRemarks(remarks);

        int result = sjqSolidliquidProduceElectricityMapper.insert(sjqSolidliquidProduceElectricity);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public SjqSolidliquidProduceElectricity getlast(){
        return sjqSolidliquidProduceElectricityMapper.getLast();
    }

}
