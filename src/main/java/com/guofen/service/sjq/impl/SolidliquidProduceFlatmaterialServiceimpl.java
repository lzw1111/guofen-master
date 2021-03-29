package com.guofen.service.sjq.impl;

import com.guofen.dao.SjqSolidliquidProduceFlatmaterialMapper;
import com.guofen.pojo.SjqSolidliquidProduceFlatmaterial;
import com.guofen.service.sjq.SolidliquidProduceFlatmaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SolidliquidProduceFlatmaterialServiceimpl implements SolidliquidProduceFlatmaterialService {
    @Autowired
    private SjqSolidliquidProduceFlatmaterialMapper sjqSolidliquidProduceFlatmaterialMapper;

    @Override
    public boolean addForm(String date,String updateTime, Double sandOutput, String operator,String remarks1) {
        SjqSolidliquidProduceFlatmaterial sjqSolidliquidProduceFlatmaterial = new SjqSolidliquidProduceFlatmaterial();
        sjqSolidliquidProduceFlatmaterial.setDate(date);
        sjqSolidliquidProduceFlatmaterial.setUpdateTime(updateTime);
        sjqSolidliquidProduceFlatmaterial.setSandOutput(sandOutput);
        sjqSolidliquidProduceFlatmaterial.setOperator(operator);
        sjqSolidliquidProduceFlatmaterial.setRemarks1(remarks1);
        int result = sjqSolidliquidProduceFlatmaterialMapper.insertSelective(sjqSolidliquidProduceFlatmaterial);
        if (result == 1){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public SjqSolidliquidProduceFlatmaterial findForm() {
        return sjqSolidliquidProduceFlatmaterialMapper.getlast();
    }

    @Override
    public boolean update(String inspector, String remarks2) {
        SjqSolidliquidProduceFlatmaterial sjqSolidliquidProduceFlatmaterial = sjqSolidliquidProduceFlatmaterialMapper.getlast();
        if (sjqSolidliquidProduceFlatmaterial.getInspector() == null){
            sjqSolidliquidProduceFlatmaterial.setInspector(inspector);
            sjqSolidliquidProduceFlatmaterial.setRemarks2(remarks2);
            sjqSolidliquidProduceFlatmaterialMapper.updateByPrimaryKeySelective(sjqSolidliquidProduceFlatmaterial);
            return true;
        }else {
            return false;
        }
    }
}
