package com.sf.edu.service;

import com.sf.edu.entity.Sys_Menu;

import java.util.List;

public interface Sys_MenuService {

    /**
     * 获取所有菜单项
     * @return
     */
    public List<Sys_Menu> getAllSys_Menu();
}
