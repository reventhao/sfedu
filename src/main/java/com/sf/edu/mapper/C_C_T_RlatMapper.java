package com.sf.edu.mapper;

import com.sf.edu.entity.C_C_T_Rlat;

public interface C_C_T_RlatMapper {
    int deleteByPrimaryKey(Integer seq);

    int insert(C_C_T_Rlat record);

    int insertSelective(C_C_T_Rlat record);

    C_C_T_Rlat selectByPrimaryKey(Integer seq);

    int updateByPrimaryKeySelective(C_C_T_Rlat record);

    int updateByPrimaryKey(C_C_T_Rlat record);
}