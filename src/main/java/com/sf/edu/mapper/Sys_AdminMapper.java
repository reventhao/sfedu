package com.sf.edu.mapper;

import com.sf.edu.entity.Sys_Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface Sys_AdminMapper {

    Sys_Admin selectByAccPwd(String acc,String pwd);

    int deleteByPrimaryKey(Integer seq);

    int insert(Sys_Admin record);

    int insertSelective(Sys_Admin record);

    Sys_Admin selectByPrimaryKey(Integer seq);

    int updateByPrimaryKeySelective(Sys_Admin record);

    int updateByPrimaryKey(Sys_Admin record);
}