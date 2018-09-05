package com.sf.edu.mapper;

import com.sf.edu.entity.C_C_T_Rlat;
import org.springframework.stereotype.Repository;

@Repository
public interface C_C_T_RlatMapper {
    int deleteByPrimaryKey(String seq);

    int insert(C_C_T_Rlat record);

    int insertSelective(C_C_T_Rlat record);

    C_C_T_Rlat selectByPrimaryKey(String seq);

    int updateByPrimaryKeySelective(C_C_T_Rlat record);

    int updateByPrimaryKey(C_C_T_Rlat record);
}