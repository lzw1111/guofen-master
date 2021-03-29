package com.guofen.service.shlj.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guofen.service.shlj.WaterMeterService;
import com.guofen.dao.ShljWaterMeterMapper;
import com.guofen.pojo.ShljWaterMeter;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class WaterMeterServiceImpl implements WaterMeterService{
    @Autowired
    private ShljWaterMeterMapper shljWaterMeterMapper;

    @Override
    public boolean add(Double wMeterReading,
                       String readingPerson,
                       String remarks){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String date = dateFormat.format(now);
        String wreadtime = timeFormat.format(now);

        ShljWaterMeter shljWaterMeter = new ShljWaterMeter();
        shljWaterMeter.setDate(date);
        shljWaterMeter.setwReadingTime(wreadtime);
        shljWaterMeter.setwMeterReading(wMeterReading);
        shljWaterMeter.setReadingPerson(readingPerson);
        shljWaterMeter.setRemarks(remarks);

        int result = shljWaterMeterMapper.insert(shljWaterMeter);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public ShljWaterMeter getlast(){
        return shljWaterMeterMapper.getLast();
    }
}