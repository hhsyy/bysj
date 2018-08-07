package org.itjl.model;

import java.io.Serializable;

public class User_role implements Serializable {
    private Integer user_role_id;

    private String user_role_name;

    private static final long serialVersionUID = 1L;

    public Integer getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(Integer user_role_id) {
        this.user_role_id = user_role_id;
    }

    public String getUser_role_name() {
        return user_role_name;
    }

    public void setUser_role_name(String user_role_name) {
        this.user_role_name = user_role_name == null ? null : user_role_name.trim();
    }
}