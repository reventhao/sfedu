package com.sf.edu.mapper;

import com.sf.edu.entity.T_Attr;
import org.springframework.stereotype.Repository;

@Repository
public interface T_AttrMapper {
    int deleteByPrimaryKey(Integer seq);

    int insert(T_Attr record);

    int insertSelective(T_Attr record);

    T_Attr selectByPrimaryKey(Integer seq);

    int updateByPrimaryKeySelective(T_Attr record);

    int updateByPrimaryKey(T_Attr record);
}