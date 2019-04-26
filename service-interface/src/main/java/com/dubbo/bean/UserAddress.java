/**
 * 
 */
package com.dubbo.bean;

import java.io.Serializable;

/**
 * @author Administrator
 *
 */
public class UserAddress implements Serializable {
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public UserAddress(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public UserAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}


	
}
