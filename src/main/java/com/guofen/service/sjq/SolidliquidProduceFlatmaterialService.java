package com.guofen.service.sjq;

import com.guofen.pojo.SjqSolidliquidProduceFlatmaterial;
import org.springframework.stereotype.Service;


public interface SolidliquidProduceFlatmaterialService {

    //第一步插入除检查人外的数据
    boolean addForm(String date,String updateTime,Double sandOutput,String operator,String remarks2);
    //第二步找到当日最新一条数据
    SjqSolidliquidProduceFlatmaterial findForm();
    //更新这条数据中的检查人//updateByPrimaryKeySelective其他项设为null就行
    boolean update(String inspector,String remarks2);
}
