package com.sf.edu.controller;

import com.sf.edu.entity.Grade;
import com.sf.edu.service.GradeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("grade/")
public class GradeController {
    @Autowired
    private GradeService gradeService;

    private static final Logger logger= LoggerFactory.getLogger(GradeController.class);

    @RequestMapping(value = "grade_page")
    public ModelAndView gradePage() {
        ModelAndView mv = new ModelAndView("grade");
        return mv;
    }

    @RequestMapping("listgrade")
    @ResponseBody
    public Map listGrade() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", gradeService.getCount());
        map.put("data", gradeService.listGrade());
        return map;
    }

    @RequestMapping(value = "savegrade")
    @ResponseBody
    public String saveGrade(Grade grade) {
        try {
            gradeService.saveGrade(grade);
            return "success";
        } catch (Exception e) {
            return "error";
        }

    }

    @RequestMapping(value = "batchput")
    @ResponseBody
    public String batchPut(@RequestBody List<Grade> list) {
        List<Integer> records = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            records.add(list.get(i).getGid());
        }
        try {
            gradeService.removeRecords(records);
            logger.info("批量删除记录");
            return "success";
        } catch (Exception e) {
            return "error";
        }
    }
}
