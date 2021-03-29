package com.guofen.service.sjq;

import com.guofen.pojo.SjqSolidliquidProduceFault;

public interface SolidliquidProduceFaultService {
    boolean addForm(String fillTime,String equipmentName,String FaultTime,String operator,String faultContent,
                    String serviceTimeStart,String serviceTimeEnd,String servicemanInCharge,String serviceMan,String faultReason,String serviceMethod,String proposer,String recoverTime,String inspector);
    SjqSolidliquidProduceFault findForm();
}
