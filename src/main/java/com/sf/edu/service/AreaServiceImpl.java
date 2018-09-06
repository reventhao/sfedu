package com.sf.edu.service;

import com.sf.edu.entity.Area;
import com.sf.edu.mapper.AreaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
}
