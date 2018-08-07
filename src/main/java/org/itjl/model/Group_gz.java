package org.itjl.model;

import java.io.Serializable;

public class Group_gz implements Serializable {
    private Integer group_gz_id;

    private Integer group_gz_user_id;

    private Integer group_bgz_id;

    private static final long serialVersionUID = 1L;

    public Integer getGroup_gz_id() {
        return group_gz_id;
    }

    public void setGroup_gz_id(Integer group_gz_id) {
        this.group_gz_id = group_gz_id;
    }

    public Integer getGroup_gz_user_id() {
        return group_gz_user_id;
    }

    public void setGroup_gz_user_id(Integer group_gz_user_id) {
        this.group_gz_user_id = group_gz_user_id;
    }

    public Integer getGroup_bgz_id() {
        return group_bgz_id;
    }

    public void setGroup_bgz_id(Integer group_bgz_id) {
        this.group_bgz_id = group_bgz_id;
    }
}