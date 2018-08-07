package org.itjl.model;

import java.io.Serializable;

public class Lb implements Serializable {
    private Integer lb_id;

    private String lb_name;

    private static final long serialVersionUID = 1L;

    public Integer getLb_id() {
        return lb_id;
    }

    public void setLb_id(Integer lb_id) {
        this.lb_id = lb_id;
    }

    public String getLb_name() {
        return lb_name;
    }

    public void setLb_name(String lb_name) {
        this.lb_name = lb_name == null ? null : lb_name.trim();
    }
}