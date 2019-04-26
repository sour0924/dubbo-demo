package com.dubbo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.MethodConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.dubbo.service.UserService;

/**
 * dubbo配置
 * @author Administrator
 *
 */
@Configuration//这是一个配置类
public class MyDubboConfig {
	
	@Bean
	public ApplicationConfig applicationConfig() {
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("boot-service-provider");
		return applicationConfig;
	}
	
	@Bean
	public RegistryConfig registryConfig() {
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setProtocol("zookeeper");
		registryConfig.setAddress("127.0.0.1:2181");
		return registryConfig;
	}
	
	@Bean
	public ProtocolConfig protocolConfig() {
		ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setName("dubbo");
		protocolConfig.setPort(20882);
		return protocolConfig;
	}
	
	@Bean
	public ServiceConfig<UserService> serviceConfig(UserService userService) {
		ServiceConfig<UserService> serviceConfig = new ServiceConfig<UserService>();
		serviceConfig.setInterface(UserService.class);
		serviceConfig.setRef(userService);
		serviceConfig.setVersion("1.0.0");
		
		MethodConfig methodConfig = new MethodConfig();
		methodConfig.setName("gets");
		methodConfig.setTimeout(1000);
		
		return serviceConfig;
	}
}
