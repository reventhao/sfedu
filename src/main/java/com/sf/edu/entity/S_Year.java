package com.sf.edu.entity;

public class S_Year {
    private String yid;

    private String invl;

    public String getYid() {
        return yid;
    }

    public void setYid(String yid) {
        this.yid = yid == null ? null : yid.trim();
    }

    public String getInvl() {
        return invl;
    }

    public void setInvl(String invl) {
        this.invl = invl == null ? null : invl.trim();
    }
}