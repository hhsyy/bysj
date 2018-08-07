package org.itjl.service;

import java.util.Date;
import java.util.List;

import org.itjl.fl.Hyb;
import org.itjl.fl.QPage;
import org.itjl.mapper.FxMapper;
import org.itjl.model.Fx;
import org.itjl.model.FxCriteria;
import org.itjl.model.Wd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class FxService {
	@Autowired
	FxMapper fxMapper;
	
	public String fxZy(Fx fx,String savepath) {
		Date date = new Date();
		fx.setFx_date(date);
		fx.setFx_xzl(0);
		fx.setUser_id(-1224847102);
		fx.setFx_wj(savepath);
		fxMapper.insert(fx);
		return "ok";
	}
	
	public QPage getFxListDate(int num ,String fx_bt) {
		System.out.println(fx_bt);
		PageHelper.startPage(num, 10);
		FxCriteria example = new FxCriteria();
		List<Fx> list = fxMapper.selectByDate(fx_bt);
		Page<Fx> listWd= (Page<Fx>)list;		
		QPage page = new QPage();
		page.setCpage(listWd.getPageNum());
		page.setPageRange(listWd.getPageSize());
		page.setTotal(listWd.getTotal());
		page.setList(listWd.getResult());
		return page;
	}
	
	public List<Hyb> getFxUserCount() {
		List<Hyb> list = fxMapper.selectByCount();	
		return list;
	}
	
	public QPage getFxListXzl(int num ,String fx_bt) {
		PageHelper.startPage(num, 10);
		FxCriteria example = new FxCriteria();
		List<Fx> list = fxMapper.selectByXzl();
		Page<Fx> listWd= (Page<Fx>)list;		
		QPage page = new QPage();
		page.setCpage(listWd.getPageNum());
		page.setPageRange(listWd.getPageSize());
		page.setTotal(listWd.getTotal());
		page.setList(listWd.getResult());
		return page;
	}

	public Fx fxDetail(int fx_id) {
		Fx fx = fxMapper.selectByPrimaryKey(fx_id);
		return fx;
	}
}
