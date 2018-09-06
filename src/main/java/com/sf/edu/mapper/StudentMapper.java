package com.sf.edu.mapper;

import com.sf.edu.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentMapper {
    int deleteByPrimaryKey(String stid);

    int deleteRecordsByPrimaryKey(List<Integer> records);

    int insert(Student record);

    int insertSelective(Student record);

    int insertRecords(List<Student> records);

    Student selectByPrimaryKey(String stid);

    List<Student> selectAllRecords();

    int selectCount();

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}