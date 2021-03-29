package com.guofen.dao;

import com.guofen.pojo.RdDischarge;
import org.springframework.stereotype.Repository;

@Repository
public interface RdDischargeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RdDischarge record);

    int insertSelective(RdDischarge record);

    RdDischarge selectByPrimaryKey(Integer id);
    RdDischarge getlast();

    int updateByPrimaryKeySelective(RdDischarge record);

    int updateByPrimaryKey(RdDischarge record);
}