package com.changinye.www.zuul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class CenterZuulApplication {

	private static Logger logger = LoggerFactory.getLogger(CenterZuulApplication.class);
	private static String name = "【Zuul网关中心】";

	public static void main(String[] args) {
		SpringApplication.run(CenterZuulApplication.class, args);
		logger.info("【启动微服务成功】{}", name);
	}

}
