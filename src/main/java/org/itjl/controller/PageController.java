package org.itjl.controller;

import java.util.List;

import org.itjl.model.Bk;
import org.itjl.service.BkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@Autowired
	BkService bkService;
	
	@RequestMapping("/")
	public String pageIndex() {
		return "index";
	}
	
	@RequestMapping("/{urlname}")
	public String pageShow(@PathVariable("urlname") String urlname) {
		return urlname;
	}
	
	@RequestMapping("/index")
	@ResponseBody
	public List<Bk> getindex(ModelAndView modelAndView) {
		List<Bk> bkTjl = bkService.findBkByTjl();
		return bkTjl;
	}
}
