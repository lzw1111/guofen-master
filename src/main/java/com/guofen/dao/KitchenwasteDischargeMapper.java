package com.guofen.dao;

import com.guofen.pojo.KitchenwasteDischarge;
import org.springframework.stereotype.Repository;

@Repository
public interface KitchenwasteDischargeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KitchenwasteDischarge record);

    int insertSelective(KitchenwasteDischarge record);

    KitchenwasteDischarge selectByPrimaryKey(Integer id);

    KitchenwasteDischarge getLast();

    int updateByPrimaryKeySelective(KitchenwasteDischarge record);

    int updateByPrimaryKey(KitchenwasteDischarge record);
}