package org.itjl.service;

import java.util.Date;
import java.util.List;

import org.itjl.fl.Hyb;
import org.itjl.fl.QPage;
import org.itjl.fl.Tools;
import org.itjl.mapper.WdMapper;
import org.itjl.model.User;
import org.itjl.model.Wd;
import org.itjl.model.WdCriteria;
import org.itjl.model.WdCriteria.Criteria;
import org.itjl.model.Wd_fl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class WdService {

	@Autowired
	WdMapper wdMapper;
	
	public String sendWd(Wd wd) {
		Date date = new Date();
		wd.setWd_cn("无");
		wd.setWd_ll(0);
		wd.setWd_time(date);
		wd.setWd_tp("无");
		wd.setUser_id(-1224847102);
		wd.setWd_fl_id(1);
		wdMapper.insert(wd);
		
		return "ok";
		
	}
	
	public QPage findWd(int num, int wd_fl_id,String wd_bt) {
		PageHelper.startPage(num, 10);
		List<Wd> list = null;
		WdCriteria example = new WdCriteria();
		list = wdMapper.selectByFlid(wd_bt, wd_fl_id);
		
		Page<Wd> listWd= (Page<Wd>)list;		
		QPage page = new QPage();
		page.setFlpage(wd_fl_id);
		page.setCpage(listWd.getPageNum());
		page.setPageRange(listWd.getPageSize());
		page.setTotal(listWd.getTotal());
		page.setList(listWd.getResult());
		return page;
	}
	
	

	public Wd showWd(int wd_id) {
		Wd wd = wdMapper.selectByPrimaryKey(wd_id);
		return wd;
	}
	
	public List<Hyb> findHyb() {
		List<Hyb> hyb =  wdMapper.selectByUser();
		return hyb;
	}
}
