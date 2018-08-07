package org.itjl.service;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.itjl.mapper.UserMapper;
import org.itjl.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserMapper usermapper;
	

	public int updateUserByName(int sex_id,String user_name) {
		User user= (User) SecurityUtils.getSubject().getPrincipal();
		System.out.println(sex_id+user_name);
		user.setSex_id(sex_id);
		user.setUser_name(user_name);	
		int i = usermapper.updateByPrimaryKey(user);
		return i;	
	}
	
	public int updateUserByPwd(String user_password) {
		User user= (User) SecurityUtils.getSubject().getPrincipal();
		user.setUser_password(user_password);	
		int i = usermapper.updateByPrimaryKey(user);
		return i;	
	}
	
	public int updateUserByTx(String user_tx) {
		User user= (User) SecurityUtils.getSubject().getPrincipal();
		user.setUser_tx(user_tx);
		int i = usermapper.updateByPrimaryKey(user);
		return i;	
	}

	public int updateUserByGxqm(String user_gxqm) {
		User user= (User) SecurityUtils.getSubject().getPrincipal();
		user.setUser_gxqm(user_gxqm);
		int i = usermapper.updateByPrimaryKey(user);
		return i;	
	}
}
