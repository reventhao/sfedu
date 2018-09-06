package com.sf.edu.controller;

import com.sf.edu.entity.Area;
import com.sf.edu.service.AreaService;
import com.sf.edu.tool.SeqGenerate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("area/")
public class AreaController {
    @Autowired
    private AreaService areaService;

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
    public String saveArea(Area area){
        String aid = SeqGenerate.getSeq(2);
        while(areaService.selectArea(aid)!=null){
            aid = SeqGenerate.getSeq(2);
        }
        System.out.println(aid);
        area.setAid(aid);
        areaService.saveArea(area);
        return "success";
    }
}