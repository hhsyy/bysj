package org.itjl.model;

import java.io.Serializable;
import java.util.Date;

public class Groupg implements Serializable {
    private Integer group_id;

    private String group_name;

    private Date group_time;

    private String group_ms;

    private String group_wj;

    private String group_gg;

    private Integer group_lv;

    private String group_bq;

    private Integer user_id;

    private Integer group_jy;

    private String group_tp;

    private static final long serialVersionUID = 1L;

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name == null ? null : group_name.trim();
    }

    public Date getGroup_time() {
        return group_time;
    }

    public void setGroup_time(Date group_time) {
        this.group_time = group_time;
    }

    public String getGroup_ms() {
        return group_ms;
    }

    public void setGroup_ms(String group_ms) {
        this.group_ms = group_ms == null ? null : group_ms.trim();
    }

    public String getGroup_wj() {
        return group_wj;
    }

    public void setGroup_wj(String group_wj) {
        this.group_wj = group_wj == null ? null : group_wj.trim();
    }

    public String getGroup_gg() {
        return group_gg;
    }

    public void setGroup_gg(String group_gg) {
        this.group_gg = group_gg == null ? null : group_gg.trim();
    }

    public Integer getGroup_lv() {
        return group_lv;
    }

    public void setGroup_lv(Integer group_lv) {
        this.group_lv = group_lv;
    }

    public String getGroup_bq() {
        return group_bq;
    }

    public void setGroup_bq(String group_bq) {
        this.group_bq = group_bq == null ? null : group_bq.trim();
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getGroup_jy() {
        return group_jy;
    }

    public void setGroup_jy(Integer group_jy) {
        this.group_jy = group_jy;
    }

    public String getGroup_tp() {
        return group_tp;
    }

    public void setGroup_tp(String group_tp) {
        this.group_tp = group_tp == null ? null : group_tp.trim();
    }
}