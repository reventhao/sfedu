package com.sf.edu.mapper;

import com.sf.edu.entity.Class;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClassMapper {

    int deleteByPrimaryKey(Integer cid);

    int deleteRecordsByPrimaryKey(List<Integer> records);

    int insert(Class record);

    int insertSelective(Class record);

    int insertRecords(List<Class> records);

    Class selectByPrimaryKey(Integer cid);

    List<Class> selectAllRecords();

    int selectCount();

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}