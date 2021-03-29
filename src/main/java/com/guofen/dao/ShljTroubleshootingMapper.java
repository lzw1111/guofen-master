package com.guofen.dao;

import com.guofen.pojo.ShljTroubleshooting;

public interface ShljTroubleshootingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShljTroubleshooting record);

    int insertSelective(ShljTroubleshooting record);

    ShljTroubleshooting selectByPrimaryKey(Integer id);

    ShljTroubleshooting getLast();

    int updateByPrimaryKeySelective(ShljTroubleshooting record);

    int updateByPrimaryKey(ShljTroubleshooting record);
}