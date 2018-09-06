package com.sf.edu.service;

import com.sf.edu.entity.Grade;
import com.sf.edu.mapper.GradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public List<Grade> listGrade() {
        return gradeMapper.selectAllRecords();
    }

    @Override
    public int saveGrade(Grade record) {
        int count = gradeMapper.insert(record);
        return count;
    }

    @Override
    public int getCount() {
        return gradeMapper.selectCount();
    }

    @Override
    public Grade selectGrade(int gid) {
        return gradeMapper.selectByPrimaryKey(gid);
    }

    @Override
    public int removeRecords(List<Integer> records) {
        int count = gradeMapper.deleteRecordsByPrimaryKey(records);
        return count;
    }
}
