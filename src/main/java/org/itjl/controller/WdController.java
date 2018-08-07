
package org.itjl.controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.itjl.fl.Hyb;
import org.itjl.fl.QPage;
import org.itjl.fl.Tools;
import org.itjl.model.Wd;
import org.itjl.service.WdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WdController {

	@Autowired
	WdService wdService;

	@RequestMapping("/sendWd")
	@ResponseBody
	public ModelAndView findWd(Wd wd) {
		String string = wdService.sendWd(wd);
		ModelAndView mav = new ModelAndView();
		if(string!=null) {
			mav.addObject("memberType", "WdYes");
			mav.setViewName("loginsuccess");
		}else {
			mav.addObject("memberType", "WdNo");
			mav.setViewName("loginfalse");
		}
		return mav;
	}

	@RequestMapping("/wd")
	@ResponseBody
	public Model findWd(Model modal, @RequestParam( defaultValue = "1") int page,
			@RequestParam(defaultValue = "0") int flid,@RequestParam(defaultValue = "zero") String ssltext) {
		try {
			String name  = new String(ssltext.getBytes("ISO-8859-1"),"UTF-8");
			QPage qpage = wdService.findWd(page, flid,name);
			List<Hyb> hyb = wdService.findHyb();
			List<Wd> findWd = qpage.getList();
			for (Wd wd : findWd) {
				 wd.setWd_date(Tools.getTime(wd.getWd_time()));
				wd.setWd_bq(Tools.delHtmlTag(wd.getWd_bq()));
			}
			modal.addAttribute("wdList", findWd);
			modal.addAttribute("hyblist", hyb);
			modal.addAttribute("qpage", qpage);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return modal;
	}


	@RequestMapping("/showWd/{wd_id}")
	@ResponseBody
	public ModelAndView showWd(@PathVariable("wd_id") int wd_id) {
		Wd wd = wdService.showWd(wd_id);
		ModelAndView modelAndView = new ModelAndView();

		SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
		String format = sd.format(wd.getWd_time());

		String wd_bq = wd.getWd_bq().replace(",", " ");

		modelAndView.addObject("wd_bq", wd_bq);
		modelAndView.addObject("date", format);
		modelAndView.addObject(wd);
		modelAndView.setViewName("wdzs");
		return modelAndView;
	}
}

//var user_id = $("#user_id").val();
//if(user_id!=null){
//	$.ajax({
//		type : "post",
//		dataType : "json",
//		url : "http://localhost:8080/itjl/findUser&"+user_id,
//		success : function(data) {
//			//$(".grxx_tx_id").text(data.user_name);
//
//		}
//	});
//
//}else{
//	
//}
