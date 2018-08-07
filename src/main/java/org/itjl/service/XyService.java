package org.itjl.service;



import java.util.Date;
import java.util.List;

import org.itjl.mapper.GroupgMapper;
import org.itjl.mapper.XqMapper;
import org.itjl.mapper.ZpMapper;
import org.itjl.model.Groupg;
import org.itjl.model.GroupgCriteria;
import org.itjl.model.Xq;
import org.itjl.model.XqCriteria;
import org.itjl.model.Zp;
import org.itjl.model.ZpCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XyService {
	@Autowired
	GroupgMapper groupgMapper;
	@Autowired
	XqMapper xqMapper;
	@Autowired
	ZpMapper zpMapper;
	
	public String zcXz(Groupg group) {
		Date date = new Date();
		group.setGroup_jy(0);
		group.setGroup_lv(1);
		group.setGroup_time(date);
		group.setUser_id(-1224847102);
		group.setGroup_gg("无");
		group.setGroup_tp("images\\xz\\4.jpg");
		groupgMapper.insert(group);
		return "ok";
	}
	
	public String xqbx(Xq xq) {
		Date date = new Date();
		xq.setXq_date(date);
		xq.setUser_id(15648654);
		xq.setXq_ll(0);
		xqMapper.insert(xq);
		return "ok";
	}
	
	public String sczp(Zp zp) {
		Date date = new Date();
		zp.setZp_ll(0);
		zp.setZp_time(date);
		zp.setGroup_id(4);
		zpMapper.insert(zp);
		return "ok";
	}
	
	public List<Groupg> getXz() {
		GroupgCriteria example = new GroupgCriteria();
		List<Groupg> list = groupgMapper.selectByExample(example );
		return list;
	}
	
	public List<Zp> xmzs() {
		ZpCriteria example = new ZpCriteria();
		List<Zp> list = zpMapper.selectByExampleWithBLOBs(example);
		return list;
	}
	
	public Zp getZpDetail(int zp_id) {
		Zp zp = zpMapper.selectByPrimaryKey(zp_id);
		return zp;
	}
	
	public List<Xq> xqzs() {
		XqCriteria example = new XqCriteria();
		List<Xq> list = xqMapper.selectByExampleWithBLOBs(example);
		return list;
	}
	
	public Xq getXqDetail(int xq_id) {
		Xq xq = xqMapper.selectByPrimaryKey(xq_id);
		return xq;
	}

	public Groupg getXzDetail(int xz_id) {
		Groupg selectByPrimaryKey = groupgMapper.selectByPrimaryKey(xz_id);
		return selectByPrimaryKey;
	}
	
}
