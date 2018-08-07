package org.itjl.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.itjl.fl.QPage;
import org.itjl.fl.Tools;
import org.itjl.fl.UserItem;
import org.itjl.model.Bk;
import org.itjl.model.Fx;
import org.itjl.model.User;
import org.itjl.model.Zx;
import org.itjl.service.BkService;
import org.itjl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@Autowired 
	private UserService userservice;
	
	@RequestMapping("/updateName")
	@ResponseBody
	public int updateName(String user_name,int userSex_id) throws Exception {
		String user_name1 = new String(user_name.getBytes("ISO-8859-1"), "UTF-8");
		int i = userservice.updateUserByName(userSex_id, user_name1);
		return i;	
	}
	
	@RequestMapping("/updateUserBy")
	@ResponseBody
	public int updateUserBy(String user_gxqm) throws Exception {
		String user_gxqm1 = new String(user_gxqm.getBytes("ISO-8859-1"), "UTF-8");
		int i = userservice.updateUserByGxqm(user_gxqm1);
		return i;	
	}
	
	@RequestMapping("/updatePwd")
	@ResponseBody
	public int updatePwd(String user_password) throws Exception {
		String user_password1 = new String(user_password.getBytes("ISO-8859-1"), "UTF-8");
		int i = userservice.updateUserByPwd(user_password1);
		return i;	
	}
	
	@RequestMapping("/sctx")
	@ResponseBody
	public int updateUserByTx(HttpServletRequest request, @RequestParam("file") MultipartFile file) throws Exception {
		
		String savepath = null;
		if (!file.isEmpty()) {
			// 上传文件路径
			String path = request.getSession().getServletContext().getRealPath("/WEB-INF/images/");
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
			savepath="images/"+name;
			System.out.println(savepath);
		} 

		int i = userservice.updateUserByTx(savepath);

		return i;
	}
}

	 
