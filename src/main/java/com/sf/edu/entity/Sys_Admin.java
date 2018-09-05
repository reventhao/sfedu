package com.sf.edu.entity;

public class Sys_Admin {
    private Integer seq;

    private String name;

    private String acc;

    private String pwd;

    private String lip;

    private String ltime;

    private Integer lid;

    private String dflag;

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc == null ? null : acc.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getLip() {
        return lip;
    }

    public void setLip(String lip) {
        this.lip = lip == null ? null : lip.trim();
    }

    public String getLtime() {
        return ltime;
    }

    public void setLtime(String ltime) {
        this.ltime = ltime == null ? null : ltime.trim();
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getDflag() {
        return dflag;
    }

    public void setDflag(String dflag) {
        this.dflag = dflag == null ? null : dflag.trim();
    }
}