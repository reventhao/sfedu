package com.sf.edu.service;

import com.sf.edu.entity.School;

import java.util.List;

public interface SchoolService {
    /**
     *
     *
     * @return
     */
    public List<School> listSchool();

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
    public int saveSchool(School school);

    public School selectSchool(int sid);

    public int removeRecords(List<Integer> records);

    public int removeRecord(int sid);

    public int saveRecords(List<School> records);
}

