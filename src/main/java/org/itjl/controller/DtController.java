package org.itjl.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.itjl.fl.Tools;
import org.itjl.fl.UserItem;
import org.itjl.model.Dt;
import org.itjl.model.User;
import org.itjl.model.Wd;
import org.itjl.service.BkService;
import org.itjl.service.DtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DtController {
	@Autowired
	private DtService dtService;
	@Autowired
	BkService bkService;
	
	@RequestMapping("/insertDt")
	@ResponseBody
	public int insertDt(String content) {
		String name;
		try {
			name = new String(content.getBytes("ISO-8859-1"),"UTF-8");
			int i = dtService.insertDt(name);
			return i;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return 0;		
	}
	
	@RequestMapping("/dt")
	@ResponseBody
	public ModelAndView getDt(ModelAndView mav) {
		User user= (User) SecurityUtils.getSubject().getPrincipal();
		List<Dt> list = dtService.getDt();
		UserItem userItem = bkService.findUserxx(user.getUser_id());
		for (Dt dt : list) {
			dt.setDt_time(Tools.getTime(dt.getDt_date()));
		}
		mav.addObject("userItem", userItem);
		mav.addObject("dtList", list);
		mav.setViewName("dt");
		return mav;	
	}
}
