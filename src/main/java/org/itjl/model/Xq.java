package org.itjl.model;

import java.io.Serializable;
import java.util.Date;

public class Xq implements Serializable {
    private Integer xq_id;

    private String xq_bt;

    private Date xq_date;

    private Integer xq_ll;

    private Integer xq_jf;

    private Integer user_id;

    private String xq_bq;

    private String xq_nr;
    
    private User user;
    
    private String xq_time;

    private static final long serialVersionUID = 1L;
      
    public String getXq_time() {
		return xq_time;
	}

	public void setXq_time(String xq_time) {
		this.xq_time = xq_time;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getXq_id() {
        return xq_id;
    }

    public void setXq_id(Integer xq_id) {
        this.xq_id = xq_id;
    }

    public String getXq_bt() {
        return xq_bt;
    }

    public void setXq_bt(String xq_bt) {
        this.xq_bt = xq_bt == null ? null : xq_bt.trim();
    }

    public Date getXq_date() {
        return xq_date;
    }

    public void setXq_date(Date xq_date) {
        this.xq_date = xq_date;
    }

    public Integer getXq_ll() {
        return xq_ll;
    }

    public void setXq_ll(Integer xq_ll) {
        this.xq_ll = xq_ll;
    }

    public Integer getXq_jf() {
        return xq_jf;
    }

    public void setXq_jf(Integer xq_jf) {
        this.xq_jf = xq_jf;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getXq_bq() {
        return xq_bq;
    }

    public void setXq_bq(String xq_bq) {
        this.xq_bq = xq_bq == null ? null : xq_bq.trim();
    }

    public String getXq_nr() {
        return xq_nr;
    }

    public void setXq_nr(String xq_nr) {
        this.xq_nr = xq_nr == null ? null : xq_nr.trim();
    }
}