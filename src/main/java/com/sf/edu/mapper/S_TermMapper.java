package com.sf.edu.mapper;

import com.sf.edu.entity.S_Term;
import org.springframework.stereotype.Repository;

@Repository
public interface S_TermMapper {
    int deleteByPrimaryKey(String smid);

    int insert(S_Term record);

    int insertSelective(S_Term record);

    S_Term selectByPrimaryKey(String smid);

    int updateByPrimaryKeySelective(S_Term record);

    int updateByPrimaryKey(S_Term record);
}