package com.guofen.service.sjq;
import com.guofen.pojo.SjqSolidliquidProduceInspection;
import com.guofen.pojo.SjqSolidliquidProduceInspectionEquipment;

import java.util.List;


public interface SjqSolidliquidProduceInspectionEquipmentService {
    public boolean add(String name,String detail,Boolean isNormal);

    public SjqSolidliquidProduceInspectionEquipment selectByPrimaryKey(Integer key);

    public List<SjqSolidliquidProduceInspectionEquipment> getlist();

}
