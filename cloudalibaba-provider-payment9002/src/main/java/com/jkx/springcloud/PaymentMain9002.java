package com.jkx.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * {@code @ClassName} PaymentMain9002
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/14 23:10
 * {@code @Version} 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class PaymentMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9002.class, args);
        log.info("alibaba-nacos-payment9002 启动成功");
    }
}