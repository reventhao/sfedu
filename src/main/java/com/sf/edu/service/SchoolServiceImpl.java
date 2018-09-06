package com.sf.edu.service;

import com.sf.edu.entity.School;
import com.sf.edu.mapper.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    @Override
    public List<School> listSchool() {
        return schoolMapper.selectAllRecords();
    }

    @Override
    @Transactional
    public int saveSchool(School record) {
        int count = schoolMapper.insert(record);
        return count;
    }

    @Override
    public int getCount() {
        return schoolMapper.selectCount();
    }

    @Override
    public School selectSchool(int aid) {
        return schoolMapper.selectByPrimaryKey(aid);
    }

    @Override
    public int removeRecords(List<Integer> records) {
        int count = schoolMapper.deleteRecordsByPrimaryKey(records);
        return count;
    }

    @Override
    public int saveRecords(List<School> records) {
        int count = schoolMapper.insertRecords(records);
        return count;
    }

    @Override
    public int removeRecord(int aid) {
        int count = schoolMapper.deleteByPrimaryKey(aid);
        return count;
    }
}
