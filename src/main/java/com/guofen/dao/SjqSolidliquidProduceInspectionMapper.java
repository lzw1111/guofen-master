package com.guofen.dao;

import com.guofen.pojo.SjqSolidliquidProduceInspection;

public interface SjqSolidliquidProduceInspectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SjqSolidliquidProduceInspection record);

    int insertSelective(SjqSolidliquidProduceInspection record);

    SjqSolidliquidProduceInspection selectByPrimaryKey(Integer id);

    SjqSolidliquidProduceInspection getLast();

    SjqSolidliquidProduceInspection getLastWeek(Integer equipment_id);

    int updateByPrimaryKeySelective(SjqSolidliquidProduceInspection record);

    int updateByPrimaryKey(SjqSolidliquidProduceInspection record);
}