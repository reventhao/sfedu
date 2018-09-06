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
        return areaMapper.listArea();
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
    public Area selectArea(String aid) {
        return areaMapper.selectByPrimaryKey(aid);
    }

    @Override
    public int removeRecords(List<Integer> records) {
        int count = areaMapper.deleteRecordsByPrimary(records);
        return count;
    }
}
