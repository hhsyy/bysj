package org.itjl.service;


import java.util.Date;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.itjl.mapper.DtMapper;
import org.itjl.model.Dt;
import org.itjl.model.DtCriteria;
import org.itjl.model.User;
import org.itjl.model.Wd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class DtService {
	@Autowired
	private DtMapper dtMapper;
	
	public int insertDt(String str) {
		User user= (User) SecurityUtils.getSubject().getPrincipal();
		Date date = new Date();
		Dt dt = new Dt();
		dt.setDt_c(0);
		dt.setDt_dz(0);
		dt.setDt_nr(str);
		dt.setDt_date(date);
		dt.setDt_sp("无");
		dt.setDt_tp("无");
		dt.setUser_id(user.getUser_id());
		int i = dtMapper.insert(dt);		
		return i;	
	}
	
	public List<Dt> getDt() {
		DtCriteria example = new DtCriteria();
		List<Dt> list = dtMapper.selectByExample(example);
		return list;	
	}
}
