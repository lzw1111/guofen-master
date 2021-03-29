package com.guofen.service.shlj;
import com.guofen.pojo.ShljYijingStationSelling;

public interface YijingStationSellingService{
    //增
    boolean add(String name,
                Double amount,
                String remarks);

    ShljYijingStationSelling getlast();
}