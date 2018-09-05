package com.sf.edu.controller;

import com.sf.edu.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("area/")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "area_page")
    public ModelAndView areaPage(){
        ModelAndView mv = new ModelAndView("area");
        return mv;
    }
}