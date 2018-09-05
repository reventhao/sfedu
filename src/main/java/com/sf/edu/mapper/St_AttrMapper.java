package com.sf.edu.mapper;

import com.sf.edu.entity.St_Attr;
import org.springframework.stereotype.Repository;

@Repository
public interface St_AttrMapper {
    int deleteByPrimaryKey(String seq);

    int insert(St_Attr record);

    int insertSelective(St_Attr record);

    St_Attr selectByPrimaryKey(String seq);

    int updateByPrimaryKeySelective(St_Attr record);

    int updateByPrimaryKey(St_Attr record);
}