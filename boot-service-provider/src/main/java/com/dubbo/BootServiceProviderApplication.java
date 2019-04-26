package com.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;


@EnableDubbo //开启基于注解的dubbo
@SpringBootApplication
public class BootServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootServiceProviderApplication.class, args);
	}

}