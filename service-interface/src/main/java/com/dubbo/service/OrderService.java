package com.dubbo.service;

import java.util.List;

import com.dubbo.bean.UserAddress;

public interface OrderService {
	/**
	 * 初始化订单
	 * @param id
	 */
	public List<UserAddress> initOrder(String id);
}
