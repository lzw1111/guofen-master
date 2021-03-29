package com.guofen.dao;

import com.guofen.pojo.KitchenwasteExport;
import org.springframework.stereotype.Repository;

@Repository
public interface KitchenwasteExportMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(KitchenwasteExport record);

    int insertSelective(KitchenwasteExport record);

    KitchenwasteExport selectByPrimaryKey(Integer id);
    KitchenwasteExport getlast();

    int updateByPrimaryKeySelective(KitchenwasteExport record);

    int updateByPrimaryKey(KitchenwasteExport record);
}