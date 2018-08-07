package org.itjl.model;

import java.io.Serializable;

public class Role_andpermisson implements Serializable {
    private Integer role_andpermisson_id;

    private Integer user_permisson_id;

    private Integer user_role_id;

    private static final long serialVersionUID = 1L;

    public Integer getRole_andpermisson_id() {
        return role_andpermisson_id;
    }

    public void setRole_andpermisson_id(Integer role_andpermisson_id) {
        this.role_andpermisson_id = role_andpermisson_id;
    }

    public Integer getUser_permisson_id() {
        return user_permisson_id;
    }

    public void setUser_permisson_id(Integer user_permisson_id) {
        this.user_permisson_id = user_permisson_id;
    }

    public Integer getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(Integer user_role_id) {
        this.user_role_id = user_role_id;
    }
}