package com.hr.o2o.web.superadmin;

import com.hr.o2o.entity.Area;
import com.hr.o2o.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea", method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> listArea() {
        Map<String, Object> map = new HashMap<>();
        List<Area> list = new ArrayList<Area> ();
        try {
            list = areaService.getAreaList();
            map.put("rows", list);
            map.put("total", list.size());
        } catch (Exception e) {
            e.printStackTrace();
            map.put("Success", false);
            map.put("errMsg", e.toString());
        }
        return map;
    }
}
