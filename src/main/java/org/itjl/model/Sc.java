package org.itjl.model;

import java.io.Serializable;

public class Sc implements Serializable {
    private Integer sc_id;

    private Integer sc_lb;

    private Integer sc_user_id;

    private String sc_nr;

    private static final long serialVersionUID = 1L;

    public Integer getSc_id() {
        return sc_id;
    }

    public void setSc_id(Integer sc_id) {
        this.sc_id = sc_id;
    }

    public Integer getSc_lb() {
        return sc_lb;
    }

    public void setSc_lb(Integer sc_lb) {
        this.sc_lb = sc_lb;
    }

    public Integer getSc_user_id() {
        return sc_user_id;
    }

    public void setSc_user_id(Integer sc_user_id) {
        this.sc_user_id = sc_user_id;
    }

    public String getSc_nr() {
        return sc_nr;
    }

    public void setSc_nr(String sc_nr) {
        this.sc_nr = sc_nr == null ? null : sc_nr.trim();
    }
}