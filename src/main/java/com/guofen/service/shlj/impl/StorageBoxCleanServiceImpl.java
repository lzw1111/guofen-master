package com.guofen.service.shlj.impl;

import com.guofen.pojo.ShljElectricityMeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guofen.service.shlj.StorageBoxCleanService;
import com.guofen.dao.ShljStorageBoxCleanMapper;
import com.guofen.pojo.ShljStorageBoxClean;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class StorageBoxCleanServiceImpl implements StorageBoxCleanService{
    @Autowired
    private ShljStorageBoxCleanMapper shljStorageBoxCleanMapper;

    @Override
    public boolean add(String wagonNumber,
                       String arrivalTime,
                       String leaveTime,
                       Double cleanWeight,
                       Double residueWeight,
                       String cleanType,
                       String residueType,
                       String recordingPerson,
                       String remarks){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(now);

        ShljStorageBoxClean shljStorageBoxClean = new ShljStorageBoxClean();
        shljStorageBoxClean.setDate(date);
        shljStorageBoxClean.setWagonNumber(wagonNumber);
        shljStorageBoxClean.setArrivalTime(arrivalTime);
        shljStorageBoxClean.setLeaveTime(leaveTime);
        shljStorageBoxClean.setCleanWeight(cleanWeight);
        shljStorageBoxClean.setCleanType(cleanType);
        shljStorageBoxClean.setResidueWeight(residueWeight);
        shljStorageBoxClean.setResidueType(residueType);
        shljStorageBoxClean.setRecordingPerson(recordingPerson);
        shljStorageBoxClean.setRemarks(remarks);

        int result = shljStorageBoxCleanMapper.insert(shljStorageBoxClean);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public ShljStorageBoxClean getlast(){
        return shljStorageBoxCleanMapper.getLast();
    }
}