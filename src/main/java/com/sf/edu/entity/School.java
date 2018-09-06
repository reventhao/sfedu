package com.sf.edu.entity;

public class School {
    private int sid;

    private String name;

    private int aid;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid =sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid =aid;
    }
}