package com.sf.edu.service;

import com.sf.edu.entity.Grade;

import java.util.List;

public interface GradeService {
    public List<Grade> listGrade();
    public int saveGrade(Grade grade);
}
