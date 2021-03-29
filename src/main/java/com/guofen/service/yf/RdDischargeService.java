package com.guofen.service.yf;

import com.guofen.pojo.RdDischarge;

public interface RdDischargeService {
    boolean submitAllInfo(RdDischarge rdDischarge);
    RdDischarge getlast();
}
