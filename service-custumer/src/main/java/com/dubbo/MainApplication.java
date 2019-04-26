/**
 * 
 */
package com.dubbo;

import java.io.IOException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.bean.UserAddress;
import com.dubbo.service.OrderService;

/**
 * @author Administrator
 *
 */
public class MainApplication {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:Consumer.xml");
		OrderService orderService = ioc.getBean(OrderService.class);
		List<UserAddress> initOrder = orderService.initOrder("1");
		System.out.println(initOrder);
		
		System.out.println("调用完成...");
		System.in.read();
	}
}
