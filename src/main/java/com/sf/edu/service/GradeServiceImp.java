package com.sf.edu.service;

import com.sf.edu.entity.Grade;
import com.sf.edu.mapper.GradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImp implements GradeService {
    @Autowired
    private GradeMapper gradeMapper;
    @Override
    public List<Grade> listGrade(){
        return gradeMapper.selectAllRecords();
    }
    @Override
    public int saveGrade(Grade record) {
        int count = gradeMapper.insert(record);
        return count;
    }
}
