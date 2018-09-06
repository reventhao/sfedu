package com.sf.edu.mapper;

import com.sf.edu.entity.S_Term;

public interface S_TermMapper {
    int deleteByPrimaryKey(Integer smid);

    int insert(S_Term record);

    int insertSelective(S_Term record);

    S_Term selectByPrimaryKey(Integer smid);

    int updateByPrimaryKeySelective(S_Term record);

    int updateByPrimaryKey(S_Term record);
}