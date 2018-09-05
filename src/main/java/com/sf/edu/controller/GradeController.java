package com.sf.edu.controller;

import com.sf.edu.entity.Grade;
import com.sf.edu.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "grade/")
public class GradeController {
    @Autowired
    private GradeService gradeService;

    @RequestMapping(value = "grade_page")
    public ModelAndView gradePage(){
        ModelAndView mv = new ModelAndView("grade");
        return mv;
    }
}
