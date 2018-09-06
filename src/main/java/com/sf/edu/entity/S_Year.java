package com.sf.edu.entity;

public class S_Year {
    private Integer yid;

    private String invl;

    public Integer getYid() {
        return yid;
    }

    public void setYid(Integer yid) {
        this.yid = yid;
    }

    public String getInvl() {
        return invl;
    }

    public void setInvl(String invl) {
        this.invl = invl == null ? null : invl.trim();
    }
}