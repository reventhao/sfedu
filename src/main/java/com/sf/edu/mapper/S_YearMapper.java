package com.sf.edu.mapper;

import com.sf.edu.entity.S_Year;
import org.springframework.stereotype.Repository;

@Repository
public interface S_YearMapper {
    int deleteByPrimaryKey(Integer yid);

    int insert(S_Year record);

    int insertSelective(S_Year record);

    S_Year selectByPrimaryKey(Integer yid);

    int updateByPrimaryKeySelective(S_Year record);

    int updateByPrimaryKey(S_Year record);
}