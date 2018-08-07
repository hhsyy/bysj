package org.itjl.model;

import java.io.Serializable;

public class User_androle implements Serializable {
    private Integer user_androle_id;

    private Integer user_role_id;

    private Integer user_id;

    private static final long serialVersionUID = 1L;

    public Integer getUser_androle_id() {
        return user_androle_id;
    }

    public void setUser_androle_id(Integer user_androle_id) {
        this.user_androle_id = user_androle_id;
    }

    public Integer getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(Integer user_role_id) {
        this.user_role_id = user_role_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}