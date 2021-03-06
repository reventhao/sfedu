package com.sf.edu.mapper;

import com.sf.edu.entity.Course;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMapper {
    int deleteByPrimaryKey(Integer csid);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer csid);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}