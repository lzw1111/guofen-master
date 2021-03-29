package com.guofen.dao;

import com.guofen.pojo.KitchenwasteIncome;
import org.springframework.stereotype.Repository;

@Repository
public interface KitchenwasteIncomeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KitchenwasteIncome record);

    int insertSelective(KitchenwasteIncome record);

    KitchenwasteIncome selectByPrimaryKey(Integer id);
    KitchenwasteIncome getlast();

    int updateByPrimaryKeySelective(KitchenwasteIncome record);

    int updateByPrimaryKey(KitchenwasteIncome record);
}