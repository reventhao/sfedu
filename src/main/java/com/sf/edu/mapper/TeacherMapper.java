package com.sf.edu.mapper;

import com.sf.edu.entity.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherMapper {
    int deleteByPrimaryKey(String tid);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(String tid);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}