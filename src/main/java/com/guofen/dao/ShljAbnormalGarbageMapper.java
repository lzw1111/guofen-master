package com.guofen.dao;

import com.guofen.pojo.ShljAbnormalGarbage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ShljAbnormalGarbageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShljAbnormalGarbage record);

    int insertSelective(ShljAbnormalGarbage record);

    ShljAbnormalGarbage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShljAbnormalGarbage record);

    int updateByPrimaryKey(ShljAbnormalGarbage record);

    ShljAbnormalGarbage findLast();
}