package com.sf.edu.controller;

import com.sf.edu.service.Sys_MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "sys_menu/")
public class Sys_MenuController {

    @Autowired
    private Sys_MenuService sys_menuService;

    @RequestMapping(value = "menu")
    public ModelAndView menuPage(){
        ModelAndView mv = new ModelAndView("menu");
        return mv;
    }

    @ResponseBody
    @RequestMapping(value = "listsys_menu")
    public void getSys_MenuList(){
    }
}
