package com.guofen.dao;

import com.guofen.pojo.SjqSolidliquidProduceFault;
import org.springframework.stereotype.Repository;

@Repository
public interface SjqSolidliquidProduceFaultMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SjqSolidliquidProduceFault record);

    int insertSelective(SjqSolidliquidProduceFault record);

    SjqSolidliquidProduceFault selectByPrimaryKey(Integer id);

    SjqSolidliquidProduceFault getLast();

    int updateByPrimaryKeySelective(SjqSolidliquidProduceFault record);

    int updateByPrimaryKey(SjqSolidliquidProduceFault record);
}