package com.sf.edu.entity;

public class Course {
    private String csid;

    private String name;

    public String getCsid() {
        return csid;
    }

    public void setCsid(String csid) {
        this.csid = csid == null ? null : csid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}