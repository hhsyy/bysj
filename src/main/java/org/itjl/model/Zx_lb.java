package org.itjl.model;

import java.io.Serializable;

public class Zx_lb implements Serializable {
    private Integer zx_lb_id;

    private String zx_lb_name;

    private static final long serialVersionUID = 1L;

    public Integer getZx_lb_id() {
        return zx_lb_id;
    }

    public void setZx_lb_id(Integer zx_lb_id) {
        this.zx_lb_id = zx_lb_id;
    }

    public String getZx_lb_name() {
        return zx_lb_name;
    }

    public void setZx_lb_name(String zx_lb_name) {
        this.zx_lb_name = zx_lb_name == null ? null : zx_lb_name.trim();
    }
}