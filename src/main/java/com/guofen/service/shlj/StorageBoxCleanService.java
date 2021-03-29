package com.guofen.service.shlj;

import com.guofen.pojo.ShljStorageBoxClean;

public interface StorageBoxCleanService{
    //增
    boolean add(String wagonNumber,
                String arrivalTime,
                String leaveTime,
                Double cleanWeight,
                Double residueWeight,
                String cleanType,
                String residueType,
                String recordingPerson,
                String remarks);

    ShljStorageBoxClean getlast();
}