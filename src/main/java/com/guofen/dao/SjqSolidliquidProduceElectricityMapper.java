package com.guofen.dao;

import com.guofen.pojo.SjqSolidliquidProduceElectricity;
import org.springframework.stereotype.Repository;

@Repository
public interface SjqSolidliquidProduceElectricityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SjqSolidliquidProduceElectricity record);

    int insertSelective(SjqSolidliquidProduceElectricity record);

    SjqSolidliquidProduceElectricity selectByPrimaryKey(Integer id);

    SjqSolidliquidProduceElectricity getLast();

    int updateByPrimaryKeySelective(SjqSolidliquidProduceElectricity record);

    int updateByPrimaryKey(SjqSolidliquidProduceElectricity record);
}