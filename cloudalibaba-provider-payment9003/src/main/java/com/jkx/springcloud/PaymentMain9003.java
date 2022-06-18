package com.jkx.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * {@code @ClassName} PaymentMain9003
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/16 16:38
 * {@code @Version} 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class PaymentMain9003 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9003.class, args);
        log.info("alibaba-nacos-payment9003 启动成功");
    }
}
