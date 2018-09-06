package com.sf.edu.mapper;

import com.sf.edu.entity.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(String stid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String stid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}