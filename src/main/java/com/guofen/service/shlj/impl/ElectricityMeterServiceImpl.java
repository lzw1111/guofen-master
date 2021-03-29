package com.guofen.service.shlj.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guofen.service.shlj.ElectricityMeterService;
import com.guofen.dao.ShljElectricityMeterMapper;
import com.guofen.pojo.ShljElectricityMeter;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ElectricityMeterServiceImpl implements ElectricityMeterService{
    @Autowired
    private ShljElectricityMeterMapper shljElectricityMeterMapper;

    @Override
    public boolean add(Double ePowerMeterReading,
                       Double eLightingMeterReading,
                       String readingPerson,
                       String remarks){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(now);
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String eReadingTime = timeFormat.format(now);

        ShljElectricityMeter shljElectricityMeter = new ShljElectricityMeter();
        shljElectricityMeter.setDate(date);
        shljElectricityMeter.seteReadingTime(eReadingTime);
        shljElectricityMeter.setePowerMeterReading(ePowerMeterReading);
        shljElectricityMeter.seteLightingMeterReading(eLightingMeterReading);
        shljElectricityMeter.setReadingPerson(readingPerson);
        shljElectricityMeter.setRemarks(remarks);

        int result = shljElectricityMeterMapper.insert(shljElectricityMeter);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public ShljElectricityMeter getlast(){
        return shljElectricityMeterMapper.getLast();
    }
}