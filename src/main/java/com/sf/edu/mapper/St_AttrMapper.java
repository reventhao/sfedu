package com.sf.edu.mapper;

import com.sf.edu.entity.St_Attr;

public interface St_AttrMapper {
    int deleteByPrimaryKey(Integer seq);

    int insert(St_Attr record);

    int insertSelective(St_Attr record);

    St_Attr selectByPrimaryKey(Integer seq);

    int updateByPrimaryKeySelective(St_Attr record);

    int updateByPrimaryKey(St_Attr record);
}