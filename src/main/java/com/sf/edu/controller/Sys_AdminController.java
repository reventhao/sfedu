package com.sf.edu.controller;

import com.sf.edu.entity.Sys_Admin;
import com.sf.edu.service.Sys_AdminService;
import com.sf.edu.service.Sys_MenuService;
import com.sf.edu.tool.VerifiCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.OutputStream;

@Controller
@RequestMapping(value = "sys_admin/")
public class Sys_AdminController {

    @Autowired
    private Sys_AdminService sys_adminService;

    @RequestMapping(value = "/")
    public String toLogin() {
        return "login";
    }

    @RequestMapping(value = "log_in")
    @ResponseBody
    public String login(@RequestParam String acc, @RequestParam String pwd, @RequestParam String vercode, HttpSession session) {
        String svercode = (String) session.getAttribute("vercode");
        Sys_Admin sys_admin = sys_adminService.login(acc,pwd);
        if (!svercode.equalsIgnoreCase(vercode.trim())) {
            return "error2";            //验证码错误
        }
        if (null == sys_admin) {
            return "error1";            //用户名或密码错误
        }
        session.setAttribute("sys_admin",sys_admin);
        return "success";
    }

    @RequestMapping(value = "get_vercode")
    public void getVerCodeImg(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setDateHeader("Expires", 0);
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setHeader("Pragma", "no-cache");
        response.setContentType("image/jpeg");
        OutputStream out = response.getOutputStream();
        VerifiCode v = new VerifiCode();
        BufferedImage image = v.getImage();
        request.getSession().setAttribute("vercode", v.getText());
        v.output(image, out);
    }
}
