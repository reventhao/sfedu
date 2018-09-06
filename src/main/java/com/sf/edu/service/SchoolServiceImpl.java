package com.sf.edu.service;

import com.sf.edu.entity.School;
import com.sf.edu.mapper.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService{
    @Autowired
    private SchoolMapper schoolMapper;
    @Override
    public List<School> listSchool() {
        return schoolMapper.selectAllRecords();
    }

    @Override
    public int saveSchool(School record) {
        int count = schoolMapper.insert(record);
        return count;
    }
}
