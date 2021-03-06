package com.sf.edu.mapper;

import com.sf.edu.entity.Sys_Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Sys_MenuMapper {
    int deleteByPrimaryKey(Integer seq);

    int insert(Sys_Menu record);

    int insertSelective(Sys_Menu record);

    Sys_Menu selectByPrimaryKey(Integer seq);

    List<Sys_Menu> selectAllRecords();

    int updateByPrimaryKeySelective(Sys_Menu record);

    int updateByPrimaryKey(Sys_Menu record);
}