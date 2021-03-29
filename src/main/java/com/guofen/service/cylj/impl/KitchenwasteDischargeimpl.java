package com.guofen.service.cylj.impl;

import com.guofen.dao.KitchenwasteDischargeMapper;
import com.guofen.pojo.KitchenwasteDischarge;
import com.guofen.service.cylj.KitchenwasteDischargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class KitchenwasteDischargeimpl implements KitchenwasteDischargeService {
    @Autowired
    private KitchenwasteDischargeMapper kitchenwasteDischargeMapper;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean submitAllInfo(KitchenwasteDischarge kitchenwasteDischarge) {
        int flag = kitchenwasteDischargeMapper.insert(kitchenwasteDischarge);
        if (flag > 0){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public KitchenwasteDischarge getlast() {
        return kitchenwasteDischargeMapper.getLast();
    }

}
