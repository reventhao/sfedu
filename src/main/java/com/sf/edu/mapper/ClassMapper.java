package com.sf.edu.mapper;

import com.sf.edu.entity.Class;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassMapper {

    List<Class> listClass();

    int deleteByPrimaryKey(String cid);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(String cid);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}