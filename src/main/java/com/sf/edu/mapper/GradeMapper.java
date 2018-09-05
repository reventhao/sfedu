package com.sf.edu.mapper;


import com.sf.edu.entity.Grade;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeMapper {
    List<Grade> listGrade();
    int deleteByPrimaryKey(String gid);

    int insert(Grade record);

    int insertSelective(Grade record);

    Grade selectByPrimaryKey(String gid);

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
}