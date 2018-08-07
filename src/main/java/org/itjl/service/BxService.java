package org.itjl.service;

import java.util.Date;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.itjl.mapper.BkMapper;
import org.itjl.mapper.ZxMapper;
import org.itjl.model.Bk;
import org.itjl.model.User;
import org.itjl.model.Zx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BxService {
	@Autowired
	BkMapper bkMapper;
	@Autowired
	ZxMapper zxMapper;
	public String saveBk(String wz_nr,Bk bk,String wz_bq) {
		User user1= (User) SecurityUtils.getSubject().getPrincipal();
		Date date = new Date();
		bk.setBk_date(date);
		bk.setBk_ll(0);
		bk.setBk_nr(wz_nr);
		bk.setBk_zt(1);
		bk.setBk_tjl(0);
		bk.setUser_id(user1.getUser_id());
		bk.setBk_bq(wz_bq);
		bkMapper.insert(bk);
		return "ok";		
	}
	
	public String saveZx(String wz_nr,Bk bk,String wz_bq,Zx zx){
		Date date = new Date();
		zx.setUser_id(-1224847102);
		zx.setZx_bq(wz_bq);
		zx.setZx_bt(bk.getBk_bt());
		zx.setZx_date(date);
		zx.setZx_ll(0);
		zx.setZx_nr(wz_nr);
		zx.setZx_tp("wu");
		zxMapper.insert(zx);
		return "ok";
		
	
}
}
