package com.guofen.service.yf.impl;


import com.guofen.dao.RdFeedMapper;
import com.guofen.pojo.RdFeed;
import com.guofen.service.yf.RdFeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RdFeedServiceImpl implements RdFeedService {
    @Autowired
    private RdFeedMapper rdFeedMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean submitAllInfo(RdFeed record) {
        int flag = rdFeedMapper.insert(record);
        if(flag > 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public RdFeed getlast() {
        return rdFeedMapper.getlast();
    }
}
