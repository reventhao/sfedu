package com.sf.edu.mapper;

import com.sf.edu.entity.Area;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AreaMapper {

    int deleteByPrimaryKey(Integer aid);

    int deleteRecordsByPrimaryKey(List<Integer> records);

    int insert(Area record);

    int insertSelective(Area record);

    int insertRecords(List<Area> records);

    Area selectByPrimaryKey(Integer aid);

    List<Area> selectAllRecords();

    int selectCount();

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}