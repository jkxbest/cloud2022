package com.jkx.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * {@code @ClassName} SentinelMain8401
 * {@code @Description} //TODO  @EnableDiscoveryClient 该注解用于向使用consul或者zookeeper作为注册中心时注册服务
 * {@code @Author} jkx
 * {@code @Data} 2022/6/16 11:27
 * {@code @Version} 1.0
 **/
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class SentinelMain8401 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelMain8401.class, args);
        log.info("alibaba-sentinel8401 启动成功");
    }
}
