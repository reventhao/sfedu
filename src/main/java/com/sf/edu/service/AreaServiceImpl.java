package com.sf.edu.service;

import com.sf.edu.entity.Area;
import com.sf.edu.mapper.AreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public List<Area> listArea() {
        return areaMapper.selectAllRecords();
    }

    @Override
    public int saveArea(Area record) {
        int count = areaMapper.insert(record);
        return count;
    }

    @Override
    public int getCount() {
        return areaMapper.selectCount();
    }

    @Override
    public Area selectArea(int aid) {
        return areaMapper.selectByPrimaryKey(aid);
    }

    @Override
    public int removeRecords(List<Integer> records) {
        int count = areaMapper.deleteRecordsByPrimaryKey(records);
        return count;
    }

    @Override
    public int saveRecords(List<Area> records) {
        int count = areaMapper.insertRecords(records);
        return count;
    }

    @Override
    public int removeRecord(int aid) {
        int count = areaMapper.deleteByPrimaryKey(aid);
        return count;
    }
}
