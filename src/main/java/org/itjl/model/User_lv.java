package org.itjl.model;

import java.io.Serializable;

public class User_lv implements Serializable {
    private Integer user_lv_id;

    private String user_lv_name;

    private static final long serialVersionUID = 1L;

    public Integer getUser_lv_id() {
        return user_lv_id;
    }

    public void setUser_lv_id(Integer user_lv_id) {
        this.user_lv_id = user_lv_id;
    }

    public String getUser_lv_name() {
        return user_lv_name;
    }

    public void setUser_lv_name(String user_lv_name) {
        this.user_lv_name = user_lv_name == null ? null : user_lv_name.trim();
    }
}