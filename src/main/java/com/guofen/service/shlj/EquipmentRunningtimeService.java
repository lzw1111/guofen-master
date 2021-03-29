package com.guofen.service.shlj;

import com.guofen.pojo.ShljEquipmentRunningtime;

public interface EquipmentRunningtimeService{

    //添加开机时间记录
    boolean addStartupTime(String startupTime);

    //添加关机时间记录
    boolean addShutdownTime(String shutdownTime,
                            String shutdownReasion);

    ShljEquipmentRunningtime findForm();
}