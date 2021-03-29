package com.guofen.service.cylj.impl;

import com.guofen.dao.KitchenwasteIncomeMapper;
import com.guofen.pojo.KitchenwasteExport;
import com.guofen.pojo.KitchenwasteIncome;
import com.guofen.service.cylj.KitchenwasteIncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class KitchenwasteIncomeimpl implements KitchenwasteIncomeService {
    @Autowired
    private KitchenwasteIncomeMapper kitchenwasteIncomeMapper;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean submitAllIndfo(KitchenwasteIncome kitchenwasteIncome) {
        int flag = kitchenwasteIncomeMapper.insert(kitchenwasteIncome);
        if (flag > 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public KitchenwasteIncome getlast() {
        return kitchenwasteIncomeMapper.getlast();
    }


}
