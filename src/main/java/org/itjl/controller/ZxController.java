package org.itjl.controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.itjl.fl.QPage;
import org.itjl.fl.Tools;
import org.itjl.model.Fx;
import org.itjl.model.Wd;
import org.itjl.model.Zx;
import org.itjl.service.FxService;
import org.itjl.service.ScService;
import org.itjl.service.ZxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ZxController {

	@Autowired
	ZxService zxService;
	@Autowired
	ScService scService;
	

	@RequestMapping("/zx")
	@ResponseBody
	public ModelAndView findZx(ModelAndView modelAndView, @RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "0") int flid, @RequestParam(defaultValue = "zero") String ssltext)
			throws Exception {
		String name = new String(ssltext.getBytes("ISO-8859-1"), "UTF-8");
		QPage list = zxService.findZx(page, name, flid);
		List<Zx> findzx = list.getList();
		for (Zx zx : findzx) {
			zx.setZx_nr(Tools.delHtmlTag(zx.getZx_nr()));
			zx.setZx_time(Tools.getTime(zx.getZx_date()));
			zx.setZx_bq(zx.getZx_bq().replace(",", " "));
		}
		modelAndView.addObject("zxList", findzx);
		modelAndView.addObject("pagelist", list);
		modelAndView.setViewName("zx");
		return modelAndView;

	}

	@RequestMapping("/zxDetail/{zx_id}")
	@ResponseBody
	public ModelAndView zxDetail(@PathVariable("zx_id") int zx_id, ModelAndView modelAndView) {
		Zx zx = zxService.zxDetail(zx_id);
		int scisok = scService.scisok(zx_id);
		zx.setZx_time(Tools.getTime(zx.getZx_date()));
		modelAndView.addObject(zx);
		modelAndView.addObject("scisok",scisok);
		modelAndView.setViewName("zxzs");
		return modelAndView;

	}
	


}
