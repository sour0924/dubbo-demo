/**
 * 
 */
package com.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dubbo.bean.UserAddress;
import com.dubbo.service.OrderService;
import com.dubbo.service.UserService;

/**
 * @author Administrator
 *	初始化订单服务
 * 考虑到后期服务多了,有些公共服务需要抽取
 * 只写具体的接口实现
 */
@Service//spring的service注解.加入ioc容器
public class OrderServiceImpl implements OrderService {
	@Autowired
	UserService userService;//暂时先拷贝过来

	public List<UserAddress> initOrder(String id) {
		System.out.println("用户id:"+id);
		//查询收货地址,需要调用地址服务,也就是provider的服务
		return userService.gets(id);
		
	}
	
	

}
