package org.itjl.service;

import java.util.List;

import org.itjl.fl.QPage;
import org.itjl.fl.UserItem;
import org.itjl.mapper.BkMapper;
import org.itjl.mapper.ChMapper;
import org.itjl.mapper.ScMapper;
import org.itjl.mapper.UserMapper;
import org.itjl.mapper.User_gzMapper;
import org.itjl.model.Bk;
import org.itjl.model.BkCriteria;
import org.itjl.model.BkCriteria.Criteria;
import org.itjl.model.Ch;
import org.itjl.model.Sc;
import org.itjl.model.ScCriteria;
import org.itjl.model.User;
import org.itjl.model.User_gzCriteria;
import org.itjl.model.Zx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class BkService {

	@Autowired
	BkMapper bkMapper;
	@Autowired
	UserMapper userMapper;
	@Autowired
	ChMapper chMapper;
	@Autowired
	User_gzMapper user_gzMapper;
	@Autowired
	ScMapper scMapper;
	
	public QPage findBk(int num,String str,String ssl) {
		PageHelper.startPage(num, 10);
		List<Bk> list = bkMapper.selectByTj(str, ssl);
		Page<Bk> listzx= (Page<Bk>)list;		
		QPage page = new QPage();
		page.setCpage(listzx.getPageNum());
		page.setPageRange(listzx.getPageSize());
		page.setTotal(listzx.getTotal());
		page.setList(listzx.getResult());
		return page;
		
	}
	
	public List<Bk> findBkByTjl() {
		List<Bk> list = bkMapper.selectByTjl();
		return list;	
	}
	
	public int addtj(int bkid,int bk_tjl) {
		Bk bk = new Bk();
		bk_tjl+=1;
		bk.setBk_id(bkid);
		bk.setBk_tjl(bk_tjl);
		bkMapper.updateTjl(bk_tjl, bkid);
		return bk_tjl;
		
	}
	
	public int addsc(int bkid,int user_id) {
		Sc sc = new Sc();
		sc.setSc_lb(1);
		sc.setSc_nr(Integer.toString(bkid));
		sc.setSc_user_id(user_id);
		int i = scMapper.insert(sc);
		return i;
	}
	
	public int delsc(int bkid,int user_id) {
		
		ScCriteria example = new ScCriteria();
		org.itjl.model.ScCriteria.Criteria criteria = example.createCriteria();
		criteria.andSc_nrEqualTo(Integer.toString(bkid));
		criteria.andSc_user_idEqualTo(user_id);
		int i = scMapper.deleteByExample(example );
		return i;
	}
	
public UserItem findUserxx(int user_id) {
		User user = userMapper.selectByPrimaryKey(user_id);
		UserItem userItem = new UserItem();
		
		int ch_id = Integer.parseInt(user.getCh_id());
		Ch ch = chMapper.selectByPrimaryKey(ch_id);
		
		userItem.setUser_id(user.getUser_id());
		userItem.setUser_name(user.getUser_name());
		userItem.setDj(user.getUser_lv_id());
		userItem.setGxqm(user.getUser_gxqm());
		userItem.setJy(user.getUser_jy());
		userItem.setUser_tx(user.getUser_tx());
		userItem.setCh(ch.getCh_name());
		userItem.setGz_count(findGz(user_id));
		userItem.setFs_count(findFs(user_id));
		userItem.setWz_count(findWz(user_id));
		userItem.setSc_count(findSc(user_id));
		return userItem;
		
	}

	//关注人数
	public int findGz(int user_id) {
		User_gzCriteria example = new User_gzCriteria();
		org.itjl.model.User_gzCriteria.Criteria criteria = example.createCriteria();
		criteria.andUser_qgz_idEqualTo(user_id);
		int count_gz = user_gzMapper.countByExample(example );
		return count_gz;
	}
	
	public int findFs(int user_id) {
		User_gzCriteria example = new User_gzCriteria();
		org.itjl.model.User_gzCriteria.Criteria criteria = example.createCriteria();
		criteria.andUser_bgz_idEqualTo(user_id);
		int count_fs = user_gzMapper.countByExample(example );
		return count_fs;
	}
	
	public int findWz(int user_id) {
		BkCriteria example = new BkCriteria();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andUser_idEqualTo(user_id);
		int count_wz = bkMapper.countByExample(example);
		return count_wz;
	}
	
	public int findSc(int user_id) {
		ScCriteria example = new ScCriteria();
		org.itjl.model.ScCriteria.Criteria criteria = example.createCriteria();
		criteria.andSc_user_idEqualTo(user_id);
		int count_sc = scMapper.countByExample(example );
		return count_sc;
	}
	
	public String findfl() {
		BkCriteria example =new BkCriteria();
		Criteria createCriteria = example.createCriteria();
		List<Bk> selectByExample = bkMapper.selectByExample(example );
		String fl = null;
		for (Bk bk : selectByExample) {
			fl+=","+bk.getBk_bq();
		}
		return fl;
	}
	
//	public List<Bk> findBkTop() {
//		List<Bk> selectByExample = bkMapper.selectTop();
//		return selectByExample;
//		
//	}
	
	public Bk showBk(int bk_id) {
		 Bk bk = bkMapper.selectByPrimaryKey(bk_id);
		return bk;
		
	}
	
//	public List<Bk> showZzBk(int user_id) {
//		List<Bk> list = bkMapper.selectUser_id(user_id );
//		return list;
//		
//	}
	
}
