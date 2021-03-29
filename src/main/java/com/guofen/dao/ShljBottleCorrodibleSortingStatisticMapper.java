package com.guofen.dao;

import com.guofen.pojo.ShljBottleCorrodibleSortingStatistic;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ShljBottleCorrodibleSortingStatisticMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShljBottleCorrodibleSortingStatistic record);

    int insertSelective(ShljBottleCorrodibleSortingStatistic record);

    ShljBottleCorrodibleSortingStatistic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShljBottleCorrodibleSortingStatistic record);

    int updateByPrimaryKey(ShljBottleCorrodibleSortingStatistic record);

    ShljBottleCorrodibleSortingStatistic findLast();
}