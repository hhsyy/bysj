package org.itjl.model;

import java.io.Serializable;
import java.util.Date;

public class Zx implements Serializable {
    private Integer zx_id;

    private String zx_bt;

    private Date zx_date;

    private Integer zx_ll;

    private Integer zx_lb_id;

    private String zx_tp;

    private String zx_bq;

    private Integer lb_id;

    private Integer user_id;

    private String zx_nr;
    
    private String zx_time;
    
    private User user;
    
    private Lb lb;
    
    private Zx_lb zx_lb;
    private static final long serialVersionUID = 1L;

    
    
    public Lb getLb() {
		return lb;
	}

	public void setLb(Lb lb) {
		this.lb = lb;
	}

	public Zx_lb getZx_lb() {
		return zx_lb;
	}

	public void setZx_lb(Zx_lb zx_lb) {
		this.zx_lb = zx_lb;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getZx_time() {
		return zx_time;
	}

	public void setZx_time(String zx_time) {
		this.zx_time = zx_time;
	}

	public Integer getZx_id() {
        return zx_id;
    }

    public void setZx_id(Integer zx_id) {
        this.zx_id = zx_id;
    }

    public String getZx_bt() {
        return zx_bt;
    }

    public void setZx_bt(String zx_bt) {
        this.zx_bt = zx_bt == null ? null : zx_bt.trim();
    }

    public Date getZx_date() {
        return zx_date;
    }

    public void setZx_date(Date zx_date) {
        this.zx_date = zx_date;
    }

    public Integer getZx_ll() {
        return zx_ll;
    }

    public void setZx_ll(Integer zx_ll) {
        this.zx_ll = zx_ll;
    }

    public Integer getZx_lb_id() {
        return zx_lb_id;
    }

    public void setZx_lb_id(Integer zx_lb_id) {
        this.zx_lb_id = zx_lb_id;
    }

    public String getZx_tp() {
        return zx_tp;
    }

    public void setZx_tp(String zx_tp) {
        this.zx_tp = zx_tp == null ? null : zx_tp.trim();
    }

    public String getZx_bq() {
        return zx_bq;
    }

    public void setZx_bq(String zx_bq) {
        this.zx_bq = zx_bq == null ? null : zx_bq.trim();
    }

    public Integer getLb_id() {
        return lb_id;
    }

    public void setLb_id(Integer lb_id) {
        this.lb_id = lb_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getZx_nr() {
        return zx_nr;
    }

    public void setZx_nr(String zx_nr) {
        this.zx_nr = zx_nr == null ? null : zx_nr.trim();
    }
}