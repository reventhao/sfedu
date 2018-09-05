package com.sf.edu.mapper;

import com.sf.edu.entity.S_Attr_Cat;
import org.springframework.stereotype.Repository;

@Repository
public interface S_Attr_CatMapper {
    int deleteByPrimaryKey(String spid);

    int insert(S_Attr_Cat record);

    int insertSelective(S_Attr_Cat record);

    S_Attr_Cat selectByPrimaryKey(String spid);

    int updateByPrimaryKeySelective(S_Attr_Cat record);

    int updateByPrimaryKey(S_Attr_Cat record);
}