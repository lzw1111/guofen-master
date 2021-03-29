package com.guofen.service.cylj;

import com.guofen.pojo.KitchenwasteDischarge;

public interface KitchenwasteDischargeService {
    boolean submitAllInfo(KitchenwasteDischarge kitchenwasteDischarge);
    KitchenwasteDischarge getlast();
}
