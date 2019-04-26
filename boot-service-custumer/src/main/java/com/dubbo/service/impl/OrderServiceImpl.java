/**
 * 
 */
package com.dubbo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.bean.UserAddress;
import com.dubbo.service.OrderService;
import com.dubbo.service.UserService;

/**
 * @author Administrator
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	//@Autowired
	@Reference  //引用服务
	UserService userService;//暂时先拷贝过来

	public List<UserAddress> initOrder(String id) {
		System.out.println("用户id:"+id);
		//查询收货地址,需要调用地址服务,也就是provider的服务
		return userService.gets(id);
		
	}

}
