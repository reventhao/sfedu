package com.sf.edu.entity;

public class Sys_Auth {
    private Integer lid;

    private String name;

    private String setid;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSetid() {
        return setid;
    }

    public void setSetid(String setid) {
        this.setid = setid == null ? null : setid.trim();
    }
}