package com.guofen.dao;

import com.guofen.pojo.RdFeed;
import org.springframework.stereotype.Repository;

@Repository
public interface RdFeedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RdFeed record);

    int insertSelective(RdFeed record);

    RdFeed selectByPrimaryKey(Integer id);
    RdFeed getlast();

    int updateByPrimaryKeySelective(RdFeed record);

    int updateByPrimaryKey(RdFeed record);
}