package com.sf.edu.mapper;

import com.sf.edu.entity.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMapper {
    int deleteByPrimaryKey(String csid);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(String csid);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}