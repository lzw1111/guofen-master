package com.guofen.service.shlj;

import com.guofen.pojo.ShljBottleCorrodibleSortingStatistic;

public interface BottleCorrodibleSortingService {
    //增
    boolean addForm(Double weight,
                    String operator,
                    String remarks);

    ShljBottleCorrodibleSortingStatistic findForm();
}
