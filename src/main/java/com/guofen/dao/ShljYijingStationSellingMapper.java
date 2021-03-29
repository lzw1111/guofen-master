package com.guofen.dao;

import com.guofen.pojo.ShljYijingStationSelling;

public interface ShljYijingStationSellingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShljYijingStationSelling record);

    int insertSelective(ShljYijingStationSelling record);

    ShljYijingStationSelling selectByPrimaryKey(Integer id);

    ShljYijingStationSelling getLast();

    int updateByPrimaryKeySelective(ShljYijingStationSelling record);

    int updateByPrimaryKey(ShljYijingStationSelling record);
}