package org.itjl.model;

import java.io.Serializable;
import java.util.Date;

public class Dt implements Serializable {
    private Integer dt_id;

    private Integer user_id;

    private String dt_nr;

    private Integer dt_dz;

    private Integer dt_c;

    private String dt_tp;

    private String dt_sp;

    private Date dt_date;
    
    private User user;
    
    private String dt_time;

    private static final long serialVersionUID = 1L;

    public String getDt_time() {
		return dt_time;
	}

	public void setDt_time(String dt_time) {
		this.dt_time = dt_time;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getDt_id() {
        return dt_id;
    }

    public void setDt_id(Integer dt_id) {
        this.dt_id = dt_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getDt_nr() {
        return dt_nr;
    }

    public void setDt_nr(String dt_nr) {
        this.dt_nr = dt_nr == null ? null : dt_nr.trim();
    }

    public Integer getDt_dz() {
        return dt_dz;
    }

    public void setDt_dz(Integer dt_dz) {
        this.dt_dz = dt_dz;
    }

    public Integer getDt_c() {
        return dt_c;
    }

    public void setDt_c(Integer dt_c) {
        this.dt_c = dt_c;
    }

    public String getDt_tp() {
        return dt_tp;
    }

    public void setDt_tp(String dt_tp) {
        this.dt_tp = dt_tp == null ? null : dt_tp.trim();
    }

    public String getDt_sp() {
        return dt_sp;
    }

    public void setDt_sp(String dt_sp) {
        this.dt_sp = dt_sp == null ? null : dt_sp.trim();
    }

    public Date getDt_date() {
        return dt_date;
    }

    public void setDt_date(Date dt_date) {
        this.dt_date = dt_date;
    }
}