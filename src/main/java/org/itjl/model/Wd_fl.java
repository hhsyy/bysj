package org.itjl.model;

import java.io.Serializable;

public class Wd_fl implements Serializable {
    private Integer wd_fl_id;

    private String wd_fl_name;

    private static final long serialVersionUID = 1L;

    public Integer getWd_fl_id() {
        return wd_fl_id;
    }

    public void setWd_fl_id(Integer wd_fl_id) {
        this.wd_fl_id = wd_fl_id;
    }

    public String getWd_fl_name() {
        return wd_fl_name;
    }

    public void setWd_fl_name(String wd_fl_name) {
        this.wd_fl_name = wd_fl_name == null ? null : wd_fl_name.trim();
    }
}