package com.guofen.dao;

import com.guofen.pojo.SjqSolidliquidProduceFlatmaterial;
import org.springframework.stereotype.Repository;

@Repository
public interface SjqSolidliquidProduceFlatmaterialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SjqSolidliquidProduceFlatmaterial record);

    int insertSelective(SjqSolidliquidProduceFlatmaterial record);

    SjqSolidliquidProduceFlatmaterial selectByPrimaryKey(Integer id);

    SjqSolidliquidProduceFlatmaterial getlast();

    int updateByPrimaryKeySelective(SjqSolidliquidProduceFlatmaterial record);

    int updateByPrimaryKey(SjqSolidliquidProduceFlatmaterial record);
}