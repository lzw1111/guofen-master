package com.guofen.dao;

import com.guofen.pojo.SjqDeodorizationCraft;
import org.springframework.stereotype.Repository;

@Repository
public interface SjqDeodorizationCraftMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SjqDeodorizationCraft record);

    int insertSelective(SjqDeodorizationCraft record);

    SjqDeodorizationCraft selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SjqDeodorizationCraft record);

    int updateByPrimaryKey(SjqDeodorizationCraft record);

    SjqDeodorizationCraft findLast();
}