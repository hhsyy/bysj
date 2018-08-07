package org.itjl.model;

import java.io.Serializable;
import java.util.Date;

public class Fx implements Serializable {
    private Integer fx_id;

    private String fx_bt;

    private Date fx_date;

    private Integer fx_xzl;

    private Integer fx_jf;

    private String fx_bq;

    private String fx_tp;
    
    private String fx_time;

    private Integer user_id;

    private String fx_wj;

    private String fx_ms;
    
    private User user;

    private static final long serialVersionUID = 1L;
    
    
    
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getFx_time() {
		return fx_time;
	}

	public void setFx_time(String fx_time) {
		this.fx_time = fx_time;
	}

	public Integer getFx_id() {
        return fx_id;
    }

    public void setFx_id(Integer fx_id) {
        this.fx_id = fx_id;
    }

    public String getFx_bt() {
        return fx_bt;
    }

    public void setFx_bt(String fx_bt) {
        this.fx_bt = fx_bt == null ? null : fx_bt.trim();
    }

    public Date getFx_date() {
        return fx_date;
    }

    public void setFx_date(Date fx_date) {
        this.fx_date = fx_date;
    }

    public Integer getFx_xzl() {
        return fx_xzl;
    }

    public void setFx_xzl(Integer fx_xzl) {
        this.fx_xzl = fx_xzl;
    }

    public Integer getFx_jf() {
        return fx_jf;
    }

    public void setFx_jf(Integer fx_jf) {
        this.fx_jf = fx_jf;
    }

    public String getFx_bq() {
        return fx_bq;
    }

    public void setFx_bq(String fx_bq) {
        this.fx_bq = fx_bq == null ? null : fx_bq.trim();
    }

    public String getFx_tp() {
        return fx_tp;
    }

    public void setFx_tp(String fx_tp) {
        this.fx_tp = fx_tp == null ? null : fx_tp.trim();
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getFx_wj() {
        return fx_wj;
    }

    public void setFx_wj(String fx_wj) {
        this.fx_wj = fx_wj == null ? null : fx_wj.trim();
    }

    public String getFx_ms() {
        return fx_ms;
    }

    public void setFx_ms(String fx_ms) {
        this.fx_ms = fx_ms == null ? null : fx_ms.trim();
    }
}