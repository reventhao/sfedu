package com.sf.edu.mapper;

import com.sf.edu.entity.T_attr;
import org.springframework.stereotype.Repository;

@Repository
public interface T_attrMapper {
    int deleteByPrimaryKey(String seq);

    int insert(T_attr record);

    int insertSelective(T_attr record);

    T_attr selectByPrimaryKey(String seq);

    int updateByPrimaryKeySelective(T_attr record);

    int updateByPrimaryKey(T_attr record);
}