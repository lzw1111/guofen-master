package com.guofen.service.sjq;

import com.guofen.pojo.SjqOverhaul;

public interface OverhaulService {
    boolean addForm(String equipment_name, String start_time, String end_time, String person_incharge, String process);

    SjqOverhaul findForm();
}
