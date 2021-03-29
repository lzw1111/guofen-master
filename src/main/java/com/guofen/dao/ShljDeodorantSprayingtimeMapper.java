package com.guofen.dao;

import com.guofen.pojo.ShljDeodorantSprayingtime;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ShljDeodorantSprayingtimeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShljDeodorantSprayingtime record);

    int insertSelective(ShljDeodorantSprayingtime record);

    ShljDeodorantSprayingtime selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShljDeodorantSprayingtime record);

    int updateByPrimaryKey(ShljDeodorantSprayingtime record);

    ShljDeodorantSprayingtime findLast();
}