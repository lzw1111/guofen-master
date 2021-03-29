package com.guofen.service.yf.impl;

import com.guofen.dao.RdDischargeMapper;
import com.guofen.pojo.RdDischarge;
import com.guofen.service.yf.RdDischargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RdDischargeimpl implements RdDischargeService {
    @Autowired
    private RdDischargeMapper rdDischargeMapper;
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean submitAllInfo(RdDischarge rdDischarge) {
        int flag = rdDischargeMapper.insert(rdDischarge);
        if (flag > 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public RdDischarge getlast() {
        return rdDischargeMapper.getlast();
    }
}
