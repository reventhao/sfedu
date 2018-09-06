package com.sf.edu.controller;

import com.sf.edu.entity.School;
import com.sf.edu.service.SchoolService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("school/")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    private static final Logger logger = LoggerFactory.getLogger(SchoolController.class);

    @RequestMapping(value = "school_page")
    public ModelAndView schoolPage() {
        ModelAndView mv = new ModelAndView("school");
        return mv;
    }

    @RequestMapping("listschool")
    @ResponseBody
    public Map listSchool() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", schoolService.getCount());
        map.put("data", schoolService.listSchool());
        return map;
    }

    @RequestMapping(value = "saveschool")
    @ResponseBody
    public String saveSchool(@RequestParam School school) {
        try {
            schoolService.saveSchool(school);
            return "success";
        } catch (Exception e) {
            return "error";
        }

    }

    @RequestMapping(value = "deleterecord")
    @ResponseBody
    public String deleteRecord(@RequestParam int sid){
        try {
            schoolService.removeRecord(sid);
            logger.info("批量导入记录");
            return "success";
        } catch (Exception e) {
            return "error";
        }
    }

    @RequestMapping(value = "deleterecords")
    @ResponseBody
    public String deleteRecords(@RequestBody List<School> list) {
        List<Integer> records = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            records.add(list.get(i).getSid());
        }
        try {
            schoolService.removeRecords(records);
            logger.info("批量删除记录");
            return "success";
        } catch (Exception e) {
            return "error";
        }
    }

    @RequestMapping(value = "saverecords")
    @ResponseBody
    public String saveRecords(@RequestBody List<School> records) {
        try {
            schoolService.saveRecords(records);
            logger.info("批量导入记录");
            return "success";
        } catch (Exception e) {
            return "error";
        }
    }
}