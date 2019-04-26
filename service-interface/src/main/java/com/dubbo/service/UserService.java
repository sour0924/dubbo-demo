package com.dubbo.service;



import java.util.List;

import com.dubbo.bean.UserAddress;
/**
 * 用户服务
 * @author Administrator
 *
 */
public interface UserService {
	/**
	 * 根据用户id返回用户地址
	 * @param id
	 * @return
	 */
	public List<UserAddress> gets(String id);
}
