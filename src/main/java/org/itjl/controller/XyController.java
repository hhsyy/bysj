package org.itjl.controller;


import java.util.List;

import javax.tools.Tool;

import org.itjl.fl.Tools;
import org.itjl.model.Groupg;
import org.itjl.model.Xq;
import org.itjl.model.Zp;
import org.itjl.service.XyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class XyController {
	@Autowired
	XyService xyService;
	
	@RequestMapping("/cjxz")
	public String cjXz(Groupg groupg) {
		xyService.zcXz(groupg);
		return "xz";
	}
	
	@RequestMapping("/sczp")
	public String sczp(Zp zp) {
		xyService.sczp(zp);
		return "xyzs";
	}
	
	@RequestMapping("/xyzs")
	public ModelAndView getXz(ModelAndView modelAndView,@RequestParam(defaultValue = "0") int flid) {
		List<Groupg> list = xyService.getXz();
		List<Zp> xmzs = xyService.xmzs();
		List<Xq> xqzs = xyService.xqzs();
		for (Groupg groupg : list) {
			groupg.setGroup_bq(groupg.getGroup_bq().replace(",", " "));
		}
		for (Xq xq : xqzs) {
			xq.setXq_bt(xq.getXq_bq().replace(",", " "));
			xq.setXq_time(Tools.getTime(xq.getXq_date()));
		}
		for (Zp zp : xmzs) {
			zp.setZp_tag(zp.getZp_tag().replace(",", " "));
			zp.setZp_ms(Tools.delHtmlTag(zp.getZp_ms()));
			zp.setZp_sj(Tools.getTime(zp.getZp_time()));
		}
		
		modelAndView.addObject("xzlist", list);
		modelAndView.addObject("zplist", xmzs);
		modelAndView.addObject("xqlist", xqzs);
		return modelAndView;
	}
	
	@RequestMapping("/zpzs/{zp_id}")
	public ModelAndView  getZpDetail(@PathVariable("zp_id") int zp_id,ModelAndView modelAndView) {
		Zp zp = xyService.getZpDetail(zp_id);
		zp.setZp_tag(zp.getZp_tag().replace(",", " "));
		zp.setZp_sj(Tools.getTime(zp.getZp_time()));
		modelAndView.addObject("zp", zp);
		modelAndView.setViewName("zpzs");
		return modelAndView;
	}
	
	@RequestMapping("/xqzs/{xq_id}")
	public ModelAndView  getxqDetail(@PathVariable("xq_id") int xq_id,ModelAndView modelAndView) {
		Xq xq = xyService.getXqDetail(xq_id);
		xq.setXq_bq(xq.getXq_bq().replace(",", " "));
		xq.setXq_time(Tools.getTime(xq.getXq_date()));
		modelAndView.addObject("xq", xq);
		modelAndView.setViewName("xqzs");
		return modelAndView;
	}
	
	@RequestMapping("/xz/{xz_id}")
	public ModelAndView  getxz(@PathVariable("xz_id") int xz_id,ModelAndView modelAndView) {
		Groupg xz = xyService.getXzDetail(xz_id);
		modelAndView.addObject("xz", xz);
		modelAndView.setViewName("xz");
		return modelAndView;
	}
	
	
}
