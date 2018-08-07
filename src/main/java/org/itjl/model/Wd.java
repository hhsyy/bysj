package org.itjl.model;

import java.io.Serializable;
import java.util.Date;

public class Wd implements Serializable {
    private Integer wd_id;

    private String wd_bt;

    private Date wd_time;

    private String wd_bq;

    private Integer wd_ll;

    private String wd_tp;

    private Integer wd_fl_id;

    private Integer wd_jf;

    private String wd_cn;

    private Integer user_id;

    private String wd_nr;
    
	private User user;

	private Wd_fl wd_fl;
	
	private String wd_date;

    private static final long serialVersionUID = 1L;
    
    

    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Wd_fl getWd_fl() {
		return wd_fl;
	}

	public void setWd_fl(Wd_fl wd_fl) {
		this.wd_fl = wd_fl;
	}

	public String getWd_date() {
		return wd_date;
	}

	public void setWd_date(String wd_date) {
		this.wd_date = wd_date;
	}

	public Integer getWd_id() {
        return wd_id;
    }

    public void setWd_id(Integer wd_id) {
        this.wd_id = wd_id;
    }

    public String getWd_bt() {
        return wd_bt;
    }

    public void setWd_bt(String wd_bt) {
        this.wd_bt = wd_bt == null ? null : wd_bt.trim();
    }

    public Date getWd_time() {
        return wd_time;
    }

    public void setWd_time(Date wd_time) {
        this.wd_time = wd_time;
    }

    public String getWd_bq() {
        return wd_bq;
    }

    public void setWd_bq(String wd_bq) {
        this.wd_bq = wd_bq == null ? null : wd_bq.trim();
    }

    public Integer getWd_ll() {
        return wd_ll;
    }

    public void setWd_ll(Integer wd_ll) {
        this.wd_ll = wd_ll;
    }

    public String getWd_tp() {
        return wd_tp;
    }

    public void setWd_tp(String wd_tp) {
        this.wd_tp = wd_tp == null ? null : wd_tp.trim();
    }

    public Integer getWd_fl_id() {
        return wd_fl_id;
    }

    public void setWd_fl_id(Integer wd_fl_id) {
        this.wd_fl_id = wd_fl_id;
    }

    public Integer getWd_jf() {
        return wd_jf;
    }

    public void setWd_jf(Integer wd_jf) {
        this.wd_jf = wd_jf;
    }

    public String getWd_cn() {
        return wd_cn;
    }

    public void setWd_cn(String wd_cn) {
        this.wd_cn = wd_cn == null ? null : wd_cn.trim();
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getWd_nr() {
        return wd_nr;
    }

    public void setWd_nr(String wd_nr) {
        this.wd_nr = wd_nr == null ? null : wd_nr.trim();
    }
}