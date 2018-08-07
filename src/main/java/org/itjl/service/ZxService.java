package org.itjl.service;

import java.util.List;

import org.itjl.fl.QPage;
import org.itjl.mapper.ZxMapper;
import org.itjl.model.Bk;
import org.itjl.model.Wd;
import org.itjl.model.WdCriteria;
import org.itjl.model.Zx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class ZxService {

	@Autowired
	ZxMapper zxMapper;

	public QPage findZx(int num,String name, int flid) {
		
		PageHelper.startPage(num, 10);
		List<Zx> list = zxMapper.selectByTj(name, flid);
		
		Page<Zx> listzx= (Page<Zx>)list;		
		QPage page = new QPage();
		page.setFlpage(flid);
		page.setCpage(listzx.getPageNum());
		page.setPageRange(listzx.getPageSize());
		page.setTotal(listzx.getTotal());
		page.setList(listzx.getResult());
		return page;
	}
	
	public Zx zxDetail(int zx_id){
		Zx zx = zxMapper.selectByPrimaryKey(zx_id);
		return zx;
	}


}
