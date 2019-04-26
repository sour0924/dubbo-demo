/**
 * 
 */
package com.dubbo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 *
 */
public class MainApplication {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("classpath:Provider.xml");
		ioc.start();
		
		System.in.read();
	}
}
