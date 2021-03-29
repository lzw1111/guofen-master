package com.guofen.service.shlj.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.guofen.service.shlj.YijingStationSellingService;
import com.guofen.dao.ShljYijingStationSellingMapper;
import com.guofen.pojo.ShljYijingStationSelling;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class YijingStationSellingServiceImpl implements YijingStationSellingService{
    @Autowired
    private ShljYijingStationSellingMapper shljYijingStationSellingMapper;

    @Override
    public boolean add(String name,
                       Double amount,
                       String remarks){
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(now);

        ShljYijingStationSelling shljYijingStationSelling = new ShljYijingStationSelling();
        shljYijingStationSelling.setName(name);
        shljYijingStationSelling.setDate(date);
        shljYijingStationSelling.setAmount(amount);
        shljYijingStationSelling.setUnit("公斤");
        Double price = 1.23;//临时给一个数
        shljYijingStationSelling.setPrice(price);
        shljYijingStationSelling.setRemarks(remarks);
        shljYijingStationSelling.setTotalPrice(amount*price);
        int result = shljYijingStationSellingMapper.insert(shljYijingStationSelling);
        if (result == 1)
            return true;
        else
            return false;
    }

    @Override
    public ShljYijingStationSelling getlast(){
        return shljYijingStationSellingMapper.getLast();
    }
}