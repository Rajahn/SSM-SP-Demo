package com.hr.o2o.service;

import com.hr.o2o.entity.Area;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AreaService {
    List<Area> getAreaList();
}
