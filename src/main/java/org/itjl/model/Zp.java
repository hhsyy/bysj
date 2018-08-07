package org.itjl.model;

import java.io.Serializable;
import java.util.Date;

public class Zp implements Serializable {
    private Integer zp_id;

    private String zp_bt;

    private Date zp_time;

    private Integer zp_ll;

    private String zp_ylt;

    private Integer zp_jf;

    private Integer group_id;

    private String zp_tag;

    private String zp_wj;

    private String zp_ms;
    
    private Groupg groupg;
    
    private String zp_sj;

    public Groupg getGroupg() {
		return groupg;
	}

	public void setGroupg(Groupg groupg) {
		this.groupg = groupg;
	}

	public String getZp_sj() {
		return zp_sj;
	}

	public void setZp_sj(String zp_sj) {
		this.zp_sj = zp_sj;
	}

	private static final long serialVersionUID = 1L;

    public Integer getZp_id() {
        return zp_id;
    }

    public void setZp_id(Integer zp_id) {
        this.zp_id = zp_id;
    }

    public String getZp_bt() {
        return zp_bt;
    }

    public void setZp_bt(String zp_bt) {
        this.zp_bt = zp_bt == null ? null : zp_bt.trim();
    }

    public Date getZp_time() {
        return zp_time;
    }

    public void setZp_time(Date zp_time) {
        this.zp_time = zp_time;
    }

    public Integer getZp_ll() {
        return zp_ll;
    }

    public void setZp_ll(Integer zp_ll) {
        this.zp_ll = zp_ll;
    }

    public String getZp_ylt() {
        return zp_ylt;
    }

    public void setZp_ylt(String zp_ylt) {
        this.zp_ylt = zp_ylt == null ? null : zp_ylt.trim();
    }

    public Integer getZp_jf() {
        return zp_jf;
    }

    public void setZp_jf(Integer zp_jf) {
        this.zp_jf = zp_jf;
    }

    public Integer getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Integer group_id) {
        this.group_id = group_id;
    }

    public String getZp_tag() {
        return zp_tag;
    }

    public void setZp_tag(String zp_tag) {
        this.zp_tag = zp_tag == null ? null : zp_tag.trim();
    }

    public String getZp_wj() {
        return zp_wj;
    }

    public void setZp_wj(String zp_wj) {
        this.zp_wj = zp_wj == null ? null : zp_wj.trim();
    }

    public String getZp_ms() {
        return zp_ms;
    }

    public void setZp_ms(String zp_ms) {
        this.zp_ms = zp_ms == null ? null : zp_ms.trim();
    }
}