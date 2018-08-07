package org.itjl.model;

import java.io.Serializable;
import java.util.Date;

public class Bk implements Serializable {
	private Integer bk_id;

	private String bk_bt;

	private Integer lb_id;

	private Date bk_date;

	private Integer bk_ll;

	private Integer bk_tjl;

	private Integer user_id;

	private Integer bk_zt;

	private String bk_bq;

	private String bk_nr;

	private User user;

	private Lb lb;

	private String time;

	private static final long serialVersionUID = 1L;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Lb getLb() {
		return lb;
	}

	public void setLb(Lb lb) {
		this.lb = lb;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getBk_id() {
		return bk_id;
	}

	public void setBk_id(Integer bk_id) {
		this.bk_id = bk_id;
	}

	public String getBk_bt() {
		return bk_bt;
	}

	public void setBk_bt(String bk_bt) {
		this.bk_bt = bk_bt == null ? null : bk_bt.trim();
	}

	public Integer getLb_id() {
		return lb_id;
	}

	public void setLb_id(Integer lb_id) {
		this.lb_id = lb_id;
	}

	public Date getBk_date() {
		return bk_date;
	}

	public void setBk_date(Date bk_date) {
		this.bk_date = bk_date;
	}

	public Integer getBk_ll() {
		return bk_ll;
	}

	public void setBk_ll(Integer bk_ll) {
		this.bk_ll = bk_ll;
	}

	public Integer getBk_tjl() {
		return bk_tjl;
	}

	public void setBk_tjl(Integer bk_tjl) {
		this.bk_tjl = bk_tjl;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getBk_zt() {
		return bk_zt;
	}

	public void setBk_zt(Integer bk_zt) {
		this.bk_zt = bk_zt;
	}

	public String getBk_bq() {
		return bk_bq;
	}

	public void setBk_bq(String bk_bq) {
		this.bk_bq = bk_bq == null ? null : bk_bq.trim();
	}

	public String getBk_nr() {
		return bk_nr;
	}

	public void setBk_nr(String bk_nr) {
		this.bk_nr = bk_nr == null ? null : bk_nr.trim();
	}
}