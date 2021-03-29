package com.guofen.dao;

import com.guofen.pojo.SjqOverhaul;
import org.springframework.stereotype.Repository;

@Repository
public interface SjqOverhaulMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SjqOverhaul record);

    int insertSelective(SjqOverhaul record);

    SjqOverhaul selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SjqOverhaul record);

    int updateByPrimaryKey(SjqOverhaul record);

    SjqOverhaul findLast();
}