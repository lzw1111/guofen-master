package com.guofen.service.shlj.impl;

import com.guofen.pojo.ShljStorageBoxClean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guofen.service.shlj.TroubleshootingService;
import com.guofen.dao.ShljTroubleshootingMapper;
import com.guofen.pojo.ShljTroubleshooting;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class TroubleshootingServiceImpl implements TroubleshootingService{
    @Autowired
    private ShljTroubleshootingMapper shljTroubleshootingMapper;

    @Override
    public boolean add(String personInCharge,
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
                       String methodProposer){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(now);

        ShljTroubleshooting shljTroubleshooting = new ShljTroubleshooting();
        shljTroubleshooting.setDate(date);
        shljTroubleshooting.setPersonInCharge(personInCharge);
        shljTroubleshooting.setSystemName(systemName);
        shljTroubleshooting.setEquipmentName(equipmentName);
        shljTroubleshooting.setStage(stage);
        shljTroubleshooting.setRecordingPerson(recordingPerson);
        shljTroubleshooting.setTimeOfFailure(timeOfFailure);
        shljTroubleshooting.setFaultDescription(faultDescription);
        shljTroubleshooting.setFaultReasion(faultReasion);
        shljTroubleshooting.setFaultRepairMethod(faultRepairMethod);
        shljTroubleshooting.setRepairStartTime(repairStartTime);
        shljTroubleshooting.setRepairEndTime(repairEndTime);
        shljTroubleshooting.setRepairPerson(repairPerson);
        shljTroubleshooting.setMethodProposer(methodProposer);

        int result = shljTroubleshootingMapper.insert(shljTroubleshooting);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public ShljTroubleshooting getlast(){
        return shljTroubleshootingMapper.getLast();
    }
}