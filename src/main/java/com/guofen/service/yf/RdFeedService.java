package com.guofen.service.yf;

import com.guofen.pojo.RdFeed;

public interface RdFeedService {
    boolean submitAllInfo(RdFeed record);
    RdFeed getlast();
}
