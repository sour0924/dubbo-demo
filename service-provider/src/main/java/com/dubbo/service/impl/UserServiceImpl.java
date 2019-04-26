/**
 * 
 */
package com.dubbo.service.impl;

import java.util.Arrays;
import java.util.List;

import com.dubbo.bean.UserAddress;
import com.dubbo.service.UserService;

/**
 * @author Administrator
 * 抽取公共接口,让生产和消费都可以依赖使用
 * 只写具体的接口实现
 * 
 * 如何使用dubbo?
 * 
 *
 */
public class UserServiceImpl implements UserService {

	/* (non-Javadoc)
	 * @see com.dubbo.service.UserService#gets(java.lang.String)
	 */
	public List<UserAddress> gets(String id) {
		//模拟数据
		UserAddress userAddress1= new UserAddress("1","北京");
		UserAddress userAddress2= new UserAddress("2","上海");
		return Arrays.asList(userAddress1,userAddress2);
	}

}
