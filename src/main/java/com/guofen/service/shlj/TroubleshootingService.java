package com.guofen.service.shlj;

import com.guofen.pojo.ShljTroubleshooting;

public interface TroubleshootingService{
    //增
    boolean add(String personInCharge,
                String systemName,
                String equipmentName,
                String stage,
                String recordingPerson,
                String timeOfFailure,
                String faultDescription,
                String faultReasion,
                String faultRepairMethod,
                String repairStartTime,
                String repairEndTime,
                String repairPerson,
                String methodProposer);

    ShljTroubleshooting getlast();
}