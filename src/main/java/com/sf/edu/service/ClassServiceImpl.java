package com.sf.edu.service;

import com.sf.edu.entity.Class;
import com.sf.edu.mapper.ClassMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService{

    @Autowired
    private ClassMapper classMapper;

    @Override
    public List<Class> listClass() {
        return classMapper.selectAllRecords();
    }
}
