package com.sf.edu.service;

import com.sf.edu.entity.Sys_Menu;
import com.sf.edu.mapper.Sys_MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Sys_MenuServiceImpl implements Sys_MenuService {

    /**
     * 注入dao层接口
     */
    @Autowired
    private Sys_MenuMapper sys_menuMapper;

    /**
     * 获取所有菜单项
     *
     * @return
     */
    @Override
    public List<Sys_Menu> getAllSys_Menu() {
        List<Sys_Menu> list = sys_menuMapper.selectAllRecords();
        return list;
    }
}
