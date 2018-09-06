package com.sf.edu.mapper;

import com.sf.edu.entity.Grade;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GradeMapper {

    int deleteByPrimaryKey(Integer gid);

    int deleteRecordsByPrimaryKey(List<Integer> records);

    int insert(Grade record);

    int insertSelective(Grade record);

    int insertRecords(List<Grade> records);

    Grade selectByPrimaryKey(Integer gid);

    List<Grade> selectAllRecords();

    int selectCount();

    int updateByPrimaryKeySelective(Grade record);

    int updateByPrimaryKey(Grade record);
}