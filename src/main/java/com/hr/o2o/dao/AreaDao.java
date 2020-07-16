package com.hr.o2o.dao;

import com.hr.o2o.entity.Area;
import org.springframework.stereotype.Component;

import java.util.List;

public interface AreaDao {

    /**
     * 列出区域列表
     * @return
     */
    List<Area>queryArea();
}
