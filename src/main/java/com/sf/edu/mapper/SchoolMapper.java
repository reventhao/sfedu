package com.sf.edu.mapper;

import com.sf.edu.entity.School;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolMapper {

    List<School> listSchool();

    int deleteByPrimaryKey(String sid);

    int insert(School record);

    int insertSelective(School record);

    School selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);
}