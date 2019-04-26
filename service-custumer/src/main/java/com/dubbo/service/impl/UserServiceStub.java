/**
 * 
 */
package com.dubbo.service.impl;

import java.util.List;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.dubbo.bean.UserAddress;
import com.dubbo.service.UserService;

/**
 * @author Administrator
 * UserService存根,调用服务拿到数据,可以进行判断
 */
public class UserServiceStub implements UserService {
	
	private final UserService userService;
	
	
	public List<UserAddress> gets(String id) {
		
		System.out.println("UserServiceStub.....");
		
		//判断过来的id不为空,才拿数据并返回
		if(!StringUtils.isEmpty(id)) {
			return userService.gets(id);
		}
		return null;
	}
	
	/**
	 * 传入的是userService远程的代理对象
	 * @param userService
	 */
	public UserServiceStub(UserService userService) {
		super();
		this.userService = userService;
	}

}
