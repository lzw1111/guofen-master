package com.guofen.service.sjq.impl;

import com.guofen.dao.SjqSolidliquidProduceFaultMapper;
import com.guofen.pojo.SjqSolidliquidProduceFault;
import com.guofen.service.sjq.SolidliquidProduceFaultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolidliquidProduceFaultServiceimpl implements SolidliquidProduceFaultService {
    @Autowired
    private SjqSolidliquidProduceFaultMapper sjqSolidliquidProduceFaultMapper;
    @Override
    public boolean addForm(String fillTime,String equipmentName, String faultTime, String operator, String faultContent, String serviceTimeStart, String serviceTimeEnd, String servicemanInCharge, String serviceMan, String faultReason, String serviceMethod, String proposer, String recoverTime, String inspector) {
        SjqSolidliquidProduceFault sjqSolidliquidProduceFault = new SjqSolidliquidProduceFault();
        sjqSolidliquidProduceFault.setFillTime(fillTime);
        sjqSolidliquidProduceFault.setEquipmentName(equipmentName);
        sjqSolidliquidProduceFault.setFaultTime(faultTime);
        sjqSolidliquidProduceFault.setOperator(operator);
        sjqSolidliquidProduceFault.setFaultContent(faultContent);
        sjqSolidliquidProduceFault.setServiceTimeStart(serviceTimeStart);
        sjqSolidliquidProduceFault.setServiceTimeEnd(serviceTimeEnd);
        sjqSolidliquidProduceFault.setServicemanInCharge(servicemanInCharge);
        sjqSolidliquidProduceFault.setServiceman(serviceMan);
        sjqSolidliquidProduceFault.setFaultReason(faultReason);
        sjqSolidliquidProduceFault.setServiceMethod(serviceMethod);
        sjqSolidliquidProduceFault.setProposer(proposer);
        sjqSolidliquidProduceFault.setRecoverTime(recoverTime);
        sjqSolidliquidProduceFault.setInspector(inspector);
        int result = sjqSolidliquidProduceFaultMapper.insert(sjqSolidliquidProduceFault);
        System.out.println(result);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public SjqSolidliquidProduceFault findForm() {
        return sjqSolidliquidProduceFaultMapper.getLast();
    }
}
