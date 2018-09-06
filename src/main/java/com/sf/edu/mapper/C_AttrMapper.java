package com.sf.edu.mapper;

import com.sf.edu.entity.C_Attr;

public interface C_AttrMapper {
    int deleteByPrimaryKey(Integer seq);

    int insert(C_Attr record);

    int insertSelective(C_Attr record);

    C_Attr selectByPrimaryKey(Integer seq);

    int updateByPrimaryKeySelective(C_Attr record);

    int updateByPrimaryKey(C_Attr record);
}