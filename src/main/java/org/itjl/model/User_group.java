package org.itjl.model;

import java.io.Serializable;

public class User_group implements Serializable {
    private Integer user_group_id;

    private Integer user_group_group_id;

    private Integer user_group_user_id;

    private String user_group_name;

    private static final long serialVersionUID = 1L;

    public Integer getUser_group_id() {
        return user_group_id;
    }

    public void setUser_group_id(Integer user_group_id) {
        this.user_group_id = user_group_id;
    }

    public Integer getUser_group_group_id() {
        return user_group_group_id;
    }

    public void setUser_group_group_id(Integer user_group_group_id) {
        this.user_group_group_id = user_group_group_id;
    }

    public Integer getUser_group_user_id() {
        return user_group_user_id;
    }

    public void setUser_group_user_id(Integer user_group_user_id) {
        this.user_group_user_id = user_group_user_id;
    }

    public String getUser_group_name() {
        return user_group_name;
    }

    public void setUser_group_name(String user_group_name) {
        this.user_group_name = user_group_name == null ? null : user_group_name.trim();
    }
}