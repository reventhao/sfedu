package com.sf.edu.mapper;

import com.sf.edu.entity.Area;
import com.sf.edu.entity.Area;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AreaMapper {

    List<Area> listArea();

    int selectCount();

    int deleteByPrimaryKey(String aid);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(String aid);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}