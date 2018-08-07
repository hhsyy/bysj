package org.itjl.model;

import java.io.Serializable;

public class User_group_permisson implements Serializable {
    private Integer user_group_permisson_id;

    private String user_group_permisson_name;

    private Integer user_group_id;

    private static final long serialVersionUID = 1L;

    public Integer getUser_group_permisson_id() {
        return user_group_permisson_id;
    }

    public void setUser_group_permisson_id(Integer user_group_permisson_id) {
        this.user_group_permisson_id = user_group_permisson_id;
    }

    public String getUser_group_permisson_name() {
        return user_group_permisson_name;
    }

    public void setUser_group_permisson_name(String user_group_permisson_name) {
        this.user_group_permisson_name = user_group_permisson_name == null ? null : user_group_permisson_name.trim();
    }

    public Integer getUser_group_id() {
        return user_group_id;
    }

    public void setUser_group_id(Integer user_group_id) {
        this.user_group_id = user_group_id;
    }
}