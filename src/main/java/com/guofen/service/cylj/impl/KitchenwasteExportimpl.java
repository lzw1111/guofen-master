package com.guofen.service.cylj.impl;

import com.guofen.dao.KitchenwasteExportMapper;
import com.guofen.pojo.KitchenwasteExport;
import com.guofen.service.cylj.KitchenwasteExportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class KitchenwasteExportimpl implements KitchenwasteExportService {
    @Autowired
    private KitchenwasteExportMapper kitchenwasteExportMapper;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean submitAllInfo(KitchenwasteExport kitchenwasteExport) {
        int flag = kitchenwasteExportMapper.insert(kitchenwasteExport);
        if (flag > 0){
            return  true;
        }else{
            return false;
        }

    }

    @Override
    public KitchenwasteExport getlast() {
        return kitchenwasteExportMapper.getlast();
    }
}
