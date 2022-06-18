package com.jkx.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * {@code @ClassName} OrderNacosMain84
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/16 16:51
 * {@code @Version} 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
@EnableFeignClients
public class OrderNacosMain84 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain84.class, args);
        log.info("alibaba-nacos-order84 启动成功");
    }
}
