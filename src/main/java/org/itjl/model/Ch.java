package org.itjl.model;

import java.io.Serializable;

public class Ch implements Serializable {
    private Integer ch_id;

    private String ch_name;

    private static final long serialVersionUID = 1L;

    public Integer getCh_id() {
        return ch_id;
    }

    public void setCh_id(Integer ch_id) {
        this.ch_id = ch_id;
    }

    public String getCh_name() {
        return ch_name;
    }

    public void setCh_name(String ch_name) {
        this.ch_name = ch_name == null ? null : ch_name.trim();
    }
}