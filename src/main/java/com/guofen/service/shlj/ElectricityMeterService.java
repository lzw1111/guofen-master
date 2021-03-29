package com.guofen.service.shlj;

import com.guofen.pojo.ShljElectricityMeter;

public interface ElectricityMeterService{
    //增
    boolean add(Double ePowerMeterReading,
                Double eLightingMeterReading,
                String readingPerson,
                String remarks);

    ShljElectricityMeter getlast();
}