package com.sf.edu.mapper;

import com.sf.edu.entity.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TeacherMapper {
    int deleteByPrimaryKey(Integer tid);

    int deleteRecordsByPrimaryKey(List<Integer> records);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    int insertRecords(List<Teacher> records);

    Teacher selectByPrimaryKey(Integer tid);

    List<Teacher> selectAllRecords();

    int selectCount();

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}