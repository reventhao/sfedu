package com.sf.edu.entity;

public class S_Term {
    private String smid;

    private String yid;

    private String name;

    public String getSmid() {
        return smid;
    }

    public void setSmid(String smid) {
        this.smid = smid == null ? null : smid.trim();
    }

    public String getYid() {
        return yid;
    }

    public void setYid(String yid) {
        this.yid = yid == null ? null : yid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}