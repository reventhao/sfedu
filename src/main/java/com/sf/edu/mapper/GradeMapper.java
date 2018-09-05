package com.sf.edu.mapper;

import com.sf.edu.entity.Grade;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeMapper {
    int deleteByPrimaryKey(String gid);

    int insert(Grade record);

    int insertSelective(Grade record);

    Grade selectByPrimaryKey(String gid);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
}