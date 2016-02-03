package com.model;

public class OnlyKey {
    private Integer id;

    private String who;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who == null ? null : who.trim();
    }
}