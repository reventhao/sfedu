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
     *
     * @return
     */
    public int saveSchool(School school);
}
