package com.sf.edu.mapper;

import com.sf.edu.entity.School;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SchoolMapper {
    int deleteByPrimaryKey(Integer sid);

    int deleteRecordsByPrimaryKey(List<Integer> records);

    int insert(School record);

    int insertSelective(School record);

    int insertRecords(List<School> records);

    School selectByPrimaryKey(Integer sid);

    List<School> selectAllRecords();

    int selectCount();

    int updateByPrimaryKeySelective(School record);

    int updateByPrimaryKey(School record);
}