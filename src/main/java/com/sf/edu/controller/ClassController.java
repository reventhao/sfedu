package com.sf.edu.controller;

import com.sf.edu.service.ClassService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "class/")
public class ClassController {

    private ClassService classService;

    @RequestMapping(value = "class_page")
    public ModelAndView classPage(){
        ModelAndView mv = new ModelAndView("class");
        return mv;
    }
}
