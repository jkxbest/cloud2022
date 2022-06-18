package com.jkx.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * {@code @ClassName} PaymentMain9001
 * {@code @Description} //TODO  @EnableDiscoveryClient 该注解用于向使用consul或者zookeeper作为注册中心时注册服务
 * {@code @Author} jkx
 * {@code @Data} 2022/6/14 22:50
 * {@code @Version} 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class PaymentMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9001.class, args);
        log.info("alibaba-nacos-payment9001 启动成功");
    }
}
