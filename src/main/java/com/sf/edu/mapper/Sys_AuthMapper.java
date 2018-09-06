package com.sf.edu.mapper;

import com.sf.edu.entity.Sys_Auth;

public interface Sys_AuthMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(Sys_Auth record);

    int insertSelective(Sys_Auth record);

    Sys_Auth selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(Sys_Auth record);

    int updateByPrimaryKey(Sys_Auth record);
}