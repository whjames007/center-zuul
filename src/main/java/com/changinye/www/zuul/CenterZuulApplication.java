package com.changinye.www.zuul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.changinye.www.zuul.filter.AccessFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class CenterZuulApplication {

	private static Logger logger = LoggerFactory.getLogger(CenterZuulApplication.class);
	private static String name = "【Zuul网关中心】";

	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CenterZuulApplication.class, args);
		logger.info("【启动微服务成功】{}", name);
	}

}
