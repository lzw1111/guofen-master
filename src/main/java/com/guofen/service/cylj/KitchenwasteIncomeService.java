package com.guofen.service.cylj;


import com.guofen.pojo.KitchenwasteIncome;

public interface KitchenwasteIncomeService {
    boolean submitAllIndfo(KitchenwasteIncome kitchenwasteIncome);
    KitchenwasteIncome getlast();
}
