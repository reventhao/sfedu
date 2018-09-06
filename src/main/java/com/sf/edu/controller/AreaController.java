package com.sf.edu.controller;

import com.sf.edu.entity.Area;
import com.sf.edu.service.AreaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("area/")
public class AreaController {
    @Autowired
    private AreaService areaService;

    private static final Logger logger = LoggerFactory.getLogger(AreaController.class);

    @RequestMapping(value = "area_page")
    public ModelAndView areaPage() {
        ModelAndView mv = new ModelAndView("area");
        return mv;
    }

    @RequestMapping("listarea")
    @ResponseBody
    public Map listArea() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", areaService.getCount());
        map.put("data", areaService.listArea());
        return map;
    }

    @RequestMapping(value = "savearea")
    @ResponseBody
    public String saveArea(Area area) {
        try {
            areaService.saveArea(area);
            return "success";
        } catch (Exception e) {
            return "error";
        }

    }

    @RequestMapping(value = "deleterecord")
    @ResponseBody
    public String deleteRecord(@RequestParam int aid){
        try {
            areaService.removeRecord(aid);
            logger.info("批量导入记录");
            return "success";
        } catch (Exception e) {
            return "error";
        }
    }

    @RequestMapping(value = "deleterecords")
    @ResponseBody
    public String deleteRecords(@RequestBody List<Area> list) {
        List<Integer> records = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            records.add(list.get(i).getAid());
        }
        try {
            areaService.removeRecords(records);
            logger.info("批量删除记录");
            return "success";
        } catch (Exception e) {
            return "error";
        }
    }

    @RequestMapping(value = "saverecords")
    @ResponseBody
    public String saveRecords(@RequestBody List<Area> records) {
        try {
            areaService.saveRecords(records);
            logger.info("批量导入记录");
            return "success";
        } catch (Exception e) {
            return "error";
        }
    }
}