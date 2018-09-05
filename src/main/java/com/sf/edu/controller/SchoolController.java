package com.sf.edu.controller;

import com.sf.edu.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("school/")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @RequestMapping(value = "school_page")
    public ModelAndView schoolPage(){
        ModelAndView mv = new ModelAndView("school");
        return mv;
    }
}