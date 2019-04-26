/**
 * 
 */
package com.dubbo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.bean.UserAddress;
import com.dubbo.service.OrderService;
import com.dubbo.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author Administrator
 *
 */
@Service
public class OrderServiceImpl implements OrderService {
	//url="127.0.0.1:20882" 直连dubbo,以防zk宕机
	//loadbalance="roundrobin" 轮询策略,共4种
	//@Autowired
	@Reference(loadbalance="roundrobin",timeout=100) //引用服务
	UserService userService;//暂时先拷贝过来
	
	@HystrixCommand(fallbackMethod="back")
	public List<UserAddress> initOrder(String id) {
		System.out.println("用户id:"+id);
		//查询收货地址,需要调用地址服务,也就是provider的服务
		return userService.gets(id);
		
	}
	
	public List<UserAddress> back(String id){
		List<UserAddress> list = new ArrayList<UserAddress>();
		UserAddress userAddress = new UserAddress();
		userAddress.setId("测试id");
		userAddress.setName("测试地址");
		list.add(userAddress);
		return list;
	}

}
