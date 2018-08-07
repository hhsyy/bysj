package org.itjl.controller;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.itjl.model.User;
import org.itjl.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import sdk.GeetestLib;

@Controller
public class LoginController {
	@Autowired
	LoginService loginService;
	
//	@RequestMapping("/my_home/{user_id}")
//	public ModelAndView my_home(@PathVariable("user_id") int user_id) {
//		ModelAndView mav = new ModelAndView();
//		String string = loginService.
//		 
//	}
	
	@RequestMapping("/register")
	public ModelAndView zcUser(String user_name,String user_password) {
		ModelAndView mav = new ModelAndView();
		String string = loginService.zcUser(user_name, user_password);
		if(string=="true") {
			mav.addObject("memberType", "zcYes");
			mav.setViewName("loginsuccess");
		}else {
			mav.addObject("memberType", "zcNo");
			mav.setViewName("loginfalse");
		}
		return mav;
	}
	
	@RequestMapping("/dl")
	public ModelAndView loginUser(String user_name,String user_password,String jz) {
		Subject subject = SecurityUtils.getSubject();
		ModelAndView mav = new ModelAndView();
        UsernamePasswordToken usernamePasswordToken = new 
                UsernamePasswordToken(user_name,user_password); 
        if("1"==jz) {
        	usernamePasswordToken.setRememberMe(true);
        }
        try {
            subject.login(usernamePasswordToken);     
    			mav.addObject("memberType", "loginYes");
    			mav.setViewName("loginsuccess");    		
        } catch (Exception e) {
            //model.addAttribute("msg", "用户名或者密码错误,登陆失败");
			mav.addObject("memberType", "loginNo");
			mav.setViewName("loginfalse");
        }
		return mav;
    	   
       }
	
	@RequestMapping("/logout")
	public String logout() {
		Subject subject = SecurityUtils.getSubject();
        try {
            subject.logout();
            return "login";
        } catch (Exception e) {;
        }
		return "login";
    	   
       }
	
	@RequestMapping("/checkedIsOk")
	@ResponseBody
	public String checkedIsOk(String user_name) {
		Boolean valid = false;
		String resultString = "" ;
		User user = loginService.getUser(user_name);
		HashMap map = new HashMap();
		ObjectMapper obmapper = new ObjectMapper ();
		if(user == null) {
			valid=true;
		}
		map.put("valid", valid);
		try {
			resultString = obmapper. writeValueAsString(map);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(valid);
		return resultString;       	   
       }

    
    @RequestMapping("/getUser")
    public Model getUser(Model model) {
    	User user= (User) SecurityUtils.getSubject().getPrincipal();
    	  
    	  model.addAttribute("user", user);
    	  return model;
	}
    
    @RequestMapping("/getYz")
    public void getYz(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
    	GeetestLib gtSdk = new GeetestLib("24f6e9d447bc21d56c7540dc1fdb8112", "8fa050256b82d007162db7f978dad343", 
    			false);
		String resStr = "{}";
		String userid = "test";
		
		//自定义参数,可选择添加
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("user_id", userid); //网站用户id
		param.put("client_type", "web"); //web:电脑上的浏览器；h5:手机上的浏览器，包括移动应用内完全内置的web_view；native：通过原生SDK植入APP应用的方式
		param.put("ip_address", "127.0.0.1"); //传输用户请求验证时所携带的IP
		
		//进行验证预处理
		int gtServerStatus = gtSdk.preProcess(param);
		//将服务器状态设置到session中
		request.getSession().setAttribute(gtSdk.gtServerStatusSessionKey, gtServerStatus);
		//将userid设置到session中
		request.getSession().setAttribute("userid", userid);
		
		resStr = gtSdk.getResponseStr();
		PrintWriter out = response.getWriter();
		out.println(resStr);
	}
    
    @RequestMapping("/VerifyLoginServlet ")
    public void VerifyLoginServlet(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
    	GeetestLib gtSdk = new GeetestLib("24f6e9d447bc21d56c7540dc1fdb8112", "8fa050256b82d007162db7f978dad343", 
    			false);
			
		String challenge = request.getParameter(GeetestLib.fn_geetest_challenge);
		String validate = request.getParameter(GeetestLib.fn_geetest_validate);
		String seccode = request.getParameter(GeetestLib.fn_geetest_seccode);
		
		//从session中获取gt-server状态
		int gt_server_status_code = (Integer) request.getSession().getAttribute(gtSdk.gtServerStatusSessionKey);
		//从session中获取userid
		String userid = (String)request.getSession().getAttribute("userid");
		
		//自定义参数,可选择添加
		HashMap<String, String> param = new HashMap<String, String>(); 
		param.put("user_id", userid); //网站用户id
		param.put("client_type", "web"); //web:电脑上的浏览器；h5:手机上的浏览器，包括移动应用内完全内置的web_view；native：通过原生SDK植入APP应用的方式
		param.put("ip_address", "127.0.0.1"); //传输用户请求验证时所携带的IP
		
		int gtResult = 0;
		if (gt_server_status_code == 1) {
			//gt-server正常，向gt-server进行二次验证
			gtResult = gtSdk.enhencedValidateRequest(challenge, validate, seccode, param);
		} else {
			// gt-server非正常情况下，进行failback模式验证
			System.out.println("failback:use your own server captcha validate");
			gtResult = gtSdk.failbackValidateRequest(challenge, validate, seccode);
		}

		if (gtResult == 1) {
			// 验证成功
			PrintWriter out = response.getWriter();
			JSONObject data = new JSONObject();
			try {
				data.put("status", "success");
				data.put("version", gtSdk.getVersionInfo());
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		else {
			// 验证失败
			JSONObject data = new JSONObject();
			try {
				data.put("status", "fail");
				data.put("version", gtSdk.getVersionInfo());
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
	}
}
