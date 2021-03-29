package com.guofen.dao;

import com.guofen.pojo.ShljEquipmentRunningtime;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ShljEquipmentRunningtimeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShljEquipmentRunningtime record);

    int insertSelective(ShljEquipmentRunningtime record);

    ShljEquipmentRunningtime selectByPrimaryKey(Integer id);

    ShljEquipmentRunningtime selectLast();

    int updateByPrimaryKeySelective(ShljEquipmentRunningtime record);

    int updateByPrimaryKey(ShljEquipmentRunningtime record);

    ShljEquipmentRunningtime findLast();
}