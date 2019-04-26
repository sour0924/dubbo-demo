/**
 * 
 */
package com.dubbo.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.bean.UserAddress;
import com.dubbo.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author Administrator
 *
 */
@Service//暴露服务
@Component//spring容器
public class UserServiceImpl implements UserService {

	/* (non-Javadoc)
	 * @see com.dubbo.service.UserService#gets(java.lang.String)
	 */
	@HystrixCommand
	@Override
	public List<UserAddress> gets(String id) {
		System.out.println("UserServiceImpl...1....");
		
		//模拟数据
		UserAddress userAddress1= new UserAddress("1","北京");
		UserAddress userAddress2= new UserAddress("2","上海");
		return Arrays.asList(userAddress1,userAddress2);
	}

}
