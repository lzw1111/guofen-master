package com.guofen.service.sjq;
import com.guofen.pojo.SjqSolidliquidProduceElectricity;

import java.util.List;

public interface SjqSolidliquidProduceElectricityService {
    public boolean add(String reading,String reader,String remarks);

    public SjqSolidliquidProduceElectricity getlast();
}
