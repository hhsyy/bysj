package org.itjl.service;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.sql.Time;
import java.util.Date;
import java.util.UUID;

import org.itjl.mapper.UserMapper;
import org.itjl.model.User;
import org.itjl.model.UserCriteria;
import org.itjl.model.UserCriteria.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	@Autowired
	UserMapper userMapper;
	
	public String zcUser(String user_name,String user_password) {
		User user = new User();
		Date date = new Date();
		long userid = date.getTime();
		int user_id=(int)userid;
		
		user.setUser_id(user_id);
		user.setUser_name(user_name);
		user.setUser_password(user_password);
		user.setUser_tx("images/user_tx/b3.ico");
		user.setUser_gxqm("无");
		user.setUser_date(date);
		user.setUser_jy(0);
		user.setUser_lv_id(1);
		user.setCh_id("1");
		user.setSex_id(3);
		user.setUser_tag("1");
		
		userMapper.insert(user);
		return "true";
		
	}
	
	public User getUser(String username) {
		User user = userMapper.selectByName(username);
		return user;
		
	}
	
	
}
