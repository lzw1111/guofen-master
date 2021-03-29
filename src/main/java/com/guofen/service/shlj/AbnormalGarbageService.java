package com.guofen.service.shlj;


import com.guofen.pojo.ShljAbnormalGarbage;

import java.util.List;

public interface AbnormalGarbageService {
    //增
    boolean addForm(String wagon_number,
                    String garbage_source,
                    String garbage_type,
                    Integer garbage_number,
                    String recording_person,
                    String remarks);

    ShljAbnormalGarbage findForm();
}
