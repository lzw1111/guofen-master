package com.guofen.service.shlj;

import com.guofen.pojo.ShljDeodorantSprayingtime;

public interface DeodorantSprayingtimeService {
    //增
    boolean addForm(String time,
                    String signature);

    ShljDeodorantSprayingtime findForm();
}
