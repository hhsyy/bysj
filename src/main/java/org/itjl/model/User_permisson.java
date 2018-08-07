package org.itjl.model;

import java.io.Serializable;

public class User_permisson implements Serializable {
    private Integer user_permisson_id;

    private String user_permisson_name;

    private static final long serialVersionUID = 1L;

    public Integer getUser_permisson_id() {
        return user_permisson_id;
    }

    public void setUser_permisson_id(Integer user_permisson_id) {
        this.user_permisson_id = user_permisson_id;
    }

    public String getUser_permisson_name() {
        return user_permisson_name;
    }

    public void setUser_permisson_name(String user_permisson_name) {
        this.user_permisson_name = user_permisson_name == null ? null : user_permisson_name.trim();
    }
}