package com.guofen.dao;

import com.guofen.pojo.ShljBlockageCleaning;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ShljBlockageCleaningMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShljBlockageCleaning record);

    int insertSelective(ShljBlockageCleaning record);

    ShljBlockageCleaning selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShljBlockageCleaning record);

    int updateByPrimaryKey(ShljBlockageCleaning record);

    ShljBlockageCleaning findLast();
}