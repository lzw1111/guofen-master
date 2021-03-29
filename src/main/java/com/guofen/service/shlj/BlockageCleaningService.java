package com.guofen.service.shlj;

import com.guofen.pojo.ShljBlockageCleaning;

public interface BlockageCleaningService {
    //增
    boolean addForm(String time,
                    String blockage_position,
                    String cleaning_person,
                    String recording_person,
                    String remarks);

    ShljBlockageCleaning findForm();
}
