package org.itjl.controller;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.itjl.fl.Hyb;
import org.itjl.fl.QPage;
import org.itjl.fl.Tools;
import org.itjl.model.Fx;
import org.itjl.model.Wd;
import org.itjl.model.Zx;
import org.itjl.service.FxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FxController {
	@Autowired
	FxService fxService;
	@RequestMapping("/fx")
	@ResponseBody
	public ModelAndView getFxList(ModelAndView modelAndView,@RequestParam( defaultValue = "1") int page,@RequestParam(defaultValue = "zero") String ssltext) throws UnsupportedEncodingException{
		String name  = new String(ssltext.getBytes("ISO-8859-1"),"UTF-8");
		QPage fxListDate = fxService.getFxListDate(page, name);
		List<Fx> listdate = fxListDate.getList();
		QPage fxListXzl = fxService.getFxListXzl(page, name);
		List<Fx> listxzl = fxListXzl.getList();
		List<Hyb> fxUserCount = fxService.getFxUserCount();
		for (Fx fx : listdate) {
			fx.setFx_time(Tools.getTime(fx.getFx_date()));
			fx.setFx_bq(fx.getFx_bq().replace(",", " "));
		}
		for (Fx fx : listxzl) {
			fx.setFx_time(Tools.getTime(fx.getFx_date()));
			fx.setFx_bq(fx.getFx_bq().replace(",", " "));
		}
		modelAndView.addObject("fxListdate",listdate);
		modelAndView.addObject("fxListxzl",listxzl);
		modelAndView.addObject("datepage",fxListDate);
		modelAndView.addObject("fxUserCount",fxUserCount);
		modelAndView.setViewName("fx");
		return modelAndView;
	}
	
	
	@RequestMapping("/fx/detail/{fx_id}")
	@ResponseBody
	public ModelAndView zxDetail(@PathVariable("fx_id") int fx_id,ModelAndView modelAndView){
		Fx fx = fxService.fxDetail(fx_id);
		fx.setFx_time(Tools.getTime(fx.getFx_date()));
		File file=new File(fx.getFx_wj());
		String size = Tools.setSize(file.length());
		
		QPage fxListDate = fxService.getFxListDate(1, "zero");
		List<Fx> listdate = fxListDate.getList();
		List<Hyb> fxUserCount = fxService.getFxUserCount();
		for (Fx f : listdate) {
			f.setFx_time(Tools.getTime(f.getFx_date()));
		}
		modelAndView.addObject("fxListdate",listdate);
		modelAndView.addObject("fxUserCount",fxUserCount);
		modelAndView.setViewName("fxzs");
		
		modelAndView.addObject("fx_size",size);
		modelAndView.addObject("fx",fx);
		modelAndView.setViewName("fxzs");
		return modelAndView;	
	}
	
	@RequestMapping("/fx/download")    
    public ResponseEntity<byte[]> download(String savepath,String filename) throws Exception{    
        String path=savepath;
        String [] strs = savepath.split("[.]");
        filename+="."+strs[1];
        File file=new File(path);  
        HttpHeaders headers = new HttpHeaders();     
        headers.setContentDispositionFormData("attachment", filename);   
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);   
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),    
                                          headers, HttpStatus.CREATED);    
    }   
}
