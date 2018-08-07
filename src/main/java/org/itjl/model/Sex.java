package org.itjl.model;

import java.io.Serializable;

public class Sex implements Serializable {
    private Integer sex_id;

    private String sex_name;

    private static final long serialVersionUID = 1L;

    public Integer getSex_id() {
        return sex_id;
    }

    public void setSex_id(Integer sex_id) {
        this.sex_id = sex_id;
    }

    public String getSex_name() {
        return sex_name;
    }

    public void setSex_name(String sex_name) {
        this.sex_name = sex_name == null ? null : sex_name.trim();
    }
}