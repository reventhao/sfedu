package com.sf.edu.mapper;

import com.sf.edu.entity.Sys_Admin;

public interface Sys_AdminMapper {
    int deleteByPrimaryKey(Integer seq);

    int insert(Sys_Admin record);

    int insertSelective(Sys_Admin record);

    Sys_Admin selectByPrimaryKey(Integer seq);

    int updateByPrimaryKeySelective(Sys_Admin record);

    int updateByPrimaryKey(Sys_Admin record);
}