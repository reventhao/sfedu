package com.sf.edu.entity;

public class Sys_Menu {
    private Integer seq;

    private String mid;

    private String name;

    private String level;

    private String link;

    private String umenu;

    private String ltarget;

    private String remark;

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getUmenu() {
        return umenu;
    }

    public void setUmenu(String umenu) {
        this.umenu = umenu == null ? null : umenu.trim();
    }

    public String getLtarget() {
        return ltarget;
    }

    public void setLtarget(String ltarget) {
        this.ltarget = ltarget == null ? null : ltarget.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}