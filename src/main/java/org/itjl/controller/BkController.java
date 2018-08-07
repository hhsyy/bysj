package org.itjl.controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.itjl.fl.QPage;
import org.itjl.fl.Tools;
import org.itjl.fl.UserItem;
import org.itjl.model.Bk;
import org.itjl.model.User;
import org.itjl.model.Zx;
import org.itjl.service.BkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BkController {

	@Autowired
	BkService bkService;

	@RequestMapping("/bk")
	@ResponseBody
	public ModelAndView findBk(ModelAndView modelAndView, @RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "zero") String str, @RequestParam(defaultValue = "zero") String ssl) throws Exception {
		String name1 = new String(str.getBytes("ISO-8859-1"), "UTF-8");
		String name2 = new String(ssl.getBytes("ISO-8859-1"), "UTF-8");
		QPage qPage = bkService.findBk(page,name1,name2);
		List<Bk> bkTjl = bkService.findBkByTjl();
		List<Bk> bkList = qPage.getList();
		for (Bk bk : bkList) {
			bk.setBk_bq(bk.getBk_bq().replace(",", " "));
			bk.setTime(Tools.getTime(bk.getBk_date()));
		}
		modelAndView.addObject("bkList", bkList);
		modelAndView.addObject("qPage", qPage);
		modelAndView.addObject("bkTjl", bkTjl);
		modelAndView.setViewName("bk"); 
		return modelAndView;
	}
	

	@RequestMapping("/selectUserxx/{userid}")
	@ResponseBody
	public UserItem findUsexx(@PathVariable("userid") int userid) {
		UserItem userItem = bkService.findUserxx(userid);
		return userItem;

	}

	@RequestMapping("/selectfl")
	@ResponseBody
	public String[] findFl() {
		String string = bkService.findfl();
		String[] res = Tools.getArray(string.split(","));
		return res;
	}
	
	@RequestMapping("/addtj")
	@ResponseBody
	public int addtj(int bkid,int bk_tjl) {
		int addtj = bkService.addtj(bkid, bk_tjl);
		return addtj;
		
	}
	
	@RequestMapping("/scbk")
	@ResponseBody
	public String scbk(int bkid,String sctext) throws Exception {
		String addr=null;
		User user= (User) SecurityUtils.getSubject().getPrincipal();
		String name = new String(sctext.getBytes("ISO-8859-1"), "UTF-8");
		if("收藏".equals(name)) {
			if(user==null) {
				addr="login";
			}else {
				int i = bkService.addsc(bkid, user.getUser_id());
				addr="取消收藏";
			}
		}else if("取消收藏".equals(name)){
			if(user==null) {
				addr="login";
			}else {
				int delsc = bkService.delsc(bkid, user.getUser_id());
				addr="收藏";
			}
		}
		return addr;
		
	}
	
	@RequestMapping("/showBk/{bk_id}")
	@ResponseBody
	public ModelAndView showBk(@PathVariable("bk_id") int bk_id) {
		Bk bk = bkService.showBk(bk_id);
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
		String format = sd.format(bk.getBk_date());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("date",format);
		modelAndView.addObject(bk);
		modelAndView.setViewName("bkzs");
		return modelAndView;
	}
	
	
}

	 
