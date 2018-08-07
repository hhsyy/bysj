package org.itjl.realm;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.itjl.mapper.UserMapper;
import org.itjl.model.User;
import org.itjl.model.UserCriteria;
import org.itjl.model.UserCriteria.Criteria;
import org.itjl.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomRealm extends AuthorizingRealm {
	@Autowired
	UserMapper userMapper;

	/**
	 * 用户授权认证
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		// String userName = principalCollection.getPrimaryPrincipal().toString();
		// SimpleAuthorizationInfo simpleAuthorizationInfo = new
		// SimpleAuthorizationInfo();
		// simpleAuthorizationInfo.setRoles(userService.queryRolesByName(userName));
		// return simpleAuthorizationInfo;
		return null;
	}

	/**
	 * 用户登陆认证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
			throws AuthenticationException {
		String userName = authenticationToken.getPrincipal().toString();
		User user = userMapper.selectByName(userName);
		if (user == null) {
			return null;
			}
		AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user,
				user.getUser_password(), "custom_Realm");
		return authenticationInfo;
	}

}
