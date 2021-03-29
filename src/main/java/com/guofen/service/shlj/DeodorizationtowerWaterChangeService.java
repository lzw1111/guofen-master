package com.guofen.service.shlj;

import com.guofen.pojo.ShljDeodorizationtowerWaterChange;

public interface DeodorizationtowerWaterChangeService {

    //开始放水
    boolean beginReducingWater(String water_reduce_time,
                         String recording_person);

    //开始加水
    boolean beginAddingWater(String water_add_time,
                             Double deodorant,
                             Double freshener);

    //开始清理填料
    boolean beginCleaningStuffing(String clean_filler_time,
                                  Integer clean_nozzle_number);

    //保存备注
    boolean add(String remarks);

    ShljDeodorizationtowerWaterChange findForm();
}
