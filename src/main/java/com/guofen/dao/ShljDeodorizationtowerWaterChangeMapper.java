package com.guofen.dao;

import com.guofen.pojo.ShljDeodorizationtowerWaterChange;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ShljDeodorizationtowerWaterChangeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShljDeodorizationtowerWaterChange record);

    int insertSelective(ShljDeodorizationtowerWaterChange record);

    ShljDeodorizationtowerWaterChange selectByPrimaryKey(Integer id);

    ShljDeodorizationtowerWaterChange selectLast();

    int updateByPrimaryKeySelective(ShljDeodorizationtowerWaterChange record);

    int updateByPrimaryKey(ShljDeodorizationtowerWaterChange record);

    ShljDeodorizationtowerWaterChange findLast();
}