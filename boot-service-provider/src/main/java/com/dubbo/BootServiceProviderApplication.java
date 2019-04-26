package com.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;


//@EnableDubbo //开启基于注解的dubbo
//@ImportResource(locations="classpath:Provider.xml")//xml配置
@EnableDubbo(scanBasePackages="com.dubbo")
@EnableHystrix //开启服务容错
@SpringBootApplication
public class BootServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootServiceProviderApplication.class, args);
	}

}
