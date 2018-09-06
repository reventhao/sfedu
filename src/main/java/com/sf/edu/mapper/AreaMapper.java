package com.sf.edu.mapper;

import com.sf.edu.entity.Area;

public interface AreaMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}