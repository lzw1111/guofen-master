package com.guofen.service.sjq;

import com.guofen.pojo.SjqDeodorizationCraft;

public interface DeodorizationCraftService {

    boolean addForm(Double dungWeight,
                    Double solidliquidWeight,
                    Double flocculationWeight,
                    Double compostWeight,
                    Double outdoorWeight,
                    Double enzymeWeight,
                    Double othersWeight,
                    String remarks);

    SjqDeodorizationCraft findForm();
}
