package com.guofen.service.cylj;

import com.guofen.pojo.KitchenwasteExport;

public interface KitchenwasteExportService {
    boolean submitAllInfo(KitchenwasteExport kitchenwasteExport);
    KitchenwasteExport getlast();
}
