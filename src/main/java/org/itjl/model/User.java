package org.itjl.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer user_id;

    private String user_name;

    private String user_password;

    private String user_tx;

    private String user_gxqm;

    private Date user_date;

    private Integer user_jy;

    private Integer user_lv_id;

    private String ch_id;

    private Integer sex_id;

    private String user_tag;

    private static final long serialVersionUID = 1L;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password == null ? null : user_password.trim();
    }

    public String getUser_tx() {
        return user_tx;
    }

    public void setUser_tx(String user_tx) {
        this.user_tx = user_tx == null ? null : user_tx.trim();
    }

    public String getUser_gxqm() {
        return user_gxqm;
    }

    public void setUser_gxqm(String user_gxqm) {
        this.user_gxqm = user_gxqm == null ? null : user_gxqm.trim();
    }

    public Date getUser_date() {
        return user_date;
    }

    public void setUser_date(Date user_date) {
        this.user_date = user_date;
    }

    public Integer getUser_jy() {
        return user_jy;
    }

    public void setUser_jy(Integer user_jy) {
        this.user_jy = user_jy;
    }

    public Integer getUser_lv_id() {
        return user_lv_id;
    }

    public void setUser_lv_id(Integer user_lv_id) {
        this.user_lv_id = user_lv_id;
    }

    public String getCh_id() {
        return ch_id;
    }

    public void setCh_id(String ch_id) {
        this.ch_id = ch_id == null ? null : ch_id.trim();
    }

    public Integer getSex_id() {
        return sex_id;
    }

    public void setSex_id(Integer sex_id) {
        this.sex_id = sex_id;
    }

    public String getUser_tag() {
        return user_tag;
    }

    public void setUser_tag(String user_tag) {
        this.user_tag = user_tag == null ? null : user_tag.trim();
    }
}