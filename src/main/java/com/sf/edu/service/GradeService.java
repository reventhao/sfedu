package com.sf.edu.service;

import com.sf.edu.entity.Grade;

import java.util.List;

public interface GradeService {
    /**
     *
     *
     * @return
     */
    public List<Grade> listGrade();

    /**
     *
     * @return
     */
    public int getCount();

    /**
     *
     *
     * @return
     */
    public int saveGrade(Grade grade);

    public Grade selectGrade(int gid);

    public int removeRecords(List<Integer> records);
}
