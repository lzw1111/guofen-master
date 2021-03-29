package com.guofen.service.sjq;
import com.guofen.pojo.SjqSolidliquidProduceInspection;

public interface SjqSolidliquidProduceInspectionService {
    public boolean add(String equipment_id,String operator,String Inspector,String remark);

    public boolean update(String id,String Inspector,String remark);

    public SjqSolidliquidProduceInspection getlast_week(Integer equipment_id);

    public SjqSolidliquidProduceInspection getlast_day();

}
