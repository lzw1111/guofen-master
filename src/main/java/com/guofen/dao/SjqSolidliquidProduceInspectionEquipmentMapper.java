package com.guofen.dao;

import com.guofen.pojo.SjqSolidliquidProduceElectricity;
import com.guofen.pojo.SjqSolidliquidProduceInspectionEquipment;

import java.util.List;

public interface SjqSolidliquidProduceInspectionEquipmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SjqSolidliquidProduceInspectionEquipment record);

    int insertSelective(SjqSolidliquidProduceInspectionEquipment record);

    SjqSolidliquidProduceInspectionEquipment selectByPrimaryKey(Integer id);

    SjqSolidliquidProduceInspectionEquipment getLast();

    List<SjqSolidliquidProduceInspectionEquipment> getlist();

    int updateByPrimaryKeySelective(SjqSolidliquidProduceInspectionEquipment record);

    int updateByPrimaryKey(SjqSolidliquidProduceInspectionEquipment record);
}