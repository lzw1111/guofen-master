package com.guofen.service.shlj;
import com.guofen.pojo.ShljWaterMeter;

public interface WaterMeterService{
    //增
    boolean add(Double wMeterReading,
                String readingPerson,
                String remarks);

    ShljWaterMeter getlast();
}