package com.sf.edu.mapper;

import com.sf.edu.entity.S_Attr;
import org.springframework.stereotype.Repository;

@Repository
public interface S_AttrMapper {
    int deleteByPrimaryKey(Integer seq);

    int insert(S_Attr record);

    int insertSelective(S_Attr record);

    S_Attr selectByPrimaryKey(Integer seq);

    int updateByPrimaryKeySelective(S_Attr record);

    int updateByPrimaryKey(S_Attr record);
}