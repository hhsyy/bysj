package org.itjl.model;

import java.io.Serializable;

public class User_gz implements Serializable {
    private Integer user_gz_id;

    private Integer user_qgz_id;

    private Integer user_bgz_id;

    private static final long serialVersionUID = 1L;

    public Integer getUser_gz_id() {
        return user_gz_id;
    }

    public void setUser_gz_id(Integer user_gz_id) {
        this.user_gz_id = user_gz_id;
    }

    public Integer getUser_qgz_id() {
        return user_qgz_id;
    }

    public void setUser_qgz_id(Integer user_qgz_id) {
        this.user_qgz_id = user_qgz_id;
    }

    public Integer getUser_bgz_id() {
        return user_bgz_id;
    }

    public void setUser_bgz_id(Integer user_bgz_id) {
        this.user_bgz_id = user_bgz_id;
    }
}