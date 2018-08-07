package org.itjl.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.itjl.model.Bk;
import org.itjl.model.Fx;
import org.itjl.model.Xq;
import org.itjl.model.Zx;
import org.itjl.service.BxService;
import org.itjl.service.FxService;
import org.itjl.service.XyService;
import org.itjl.service.ZxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class bxController {
	@Autowired
	BxService bxService;
	@Autowired
	FxService fxService;
	@Autowired
	XyService xyService;

	 @RequestMapping("/bxxx")
	 public ModelAndView zcUser(String wz_sx, String wz_nr, Bk bk, String wz_bq, Zx zx,ModelAndView mav)
	 {
	 if ("1".equals(wz_sx)) {
	 String string = bxService.saveBk(wz_nr, bk, wz_bq);
	 if (string != null) {
			mav.addObject("memberType", "BkYes");
			mav.setViewName("loginsuccess");
		} else {
			mav.addObject("memberType", "BkNo");
			mav.setViewName("loginfalse");
		}
	 }
	
	 if ("2".equals(wz_sx)) {
		 String string = bxService.saveZx(wz_nr, bk, wz_bq, zx);
	 if (string != null) {
			mav.addObject("memberType", "ZxYes");
			mav.setViewName("loginsuccess");
		} else {
			mav.addObject("memberType", "ZxNo");
			mav.setViewName("loginfalse");
		}
	 }
	 return mav;
	 }

	@RequestMapping("/sczy")
	public ModelAndView fxZy(HttpServletRequest request,Fx fx, String fx_lb, @RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		if ("1".equals(fx_lb)) {
			fx.setFx_tp("images/fx/ysb.ico");
		} else if ("2".equals(fx_lb)) {
			fx.setFx_tp("images/fx/wd.ico");
		} else if ("3".equals(fx_lb)) {
			fx.setFx_tp("images/fx/ym.ico");
		} else if ("4".equals(fx_lb)) {
			fx.setFx_tp("images/fx/rj.ico");
		} else if ("5".equals(fx_lb)) {
			fx.setFx_tp("images/fx/qt.ico");
		}
		String fileistrue,savepath = null;
		if (!file.isEmpty()) {
			// 上传文件路径
			String path = request.getSession().getServletContext().getRealPath("/WEB-INF/file/");
			// 上传文件名
			String name =UUID.randomUUID().toString();
			String filename = file.getOriginalFilename();
			String [] strs = filename.split("[.]");
			name+="."+strs[1];
			File filepath = new File(path, name);
			// 判断路径是否存在，如果不存在就创建一个
			if (!filepath.getParentFile().exists()) {
				filepath.getParentFile().mkdirs();
			}
			// 将上传文件保存到一个目标文件当中
			file.transferTo(new File(path + File.separator + name));
			savepath=filepath.getAbsolutePath();
			fileistrue = "1";
		} else {
			fileistrue = "0";
		}

		String string = fxService.fxZy(fx,savepath);

		ModelAndView mav = new ModelAndView();
		if (string != null || fileistrue != "0") {
			mav.addObject("memberType", "FxYes");
			mav.setViewName("loginsuccess");
		} else {
			mav.addObject("memberType", "FxNo");
			mav.setViewName("loginfalse");
		}
		return mav;
	}

	@RequestMapping("/xqbx")
	public String xqbx(Xq xq) {
		xyService.xqbx(xq);
		return "xyzs";
	}

}
