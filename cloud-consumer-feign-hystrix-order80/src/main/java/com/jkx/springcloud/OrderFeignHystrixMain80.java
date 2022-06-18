package com.jkx.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * {@code @ClassName} OrderFeignHystrix80
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/12 14:22
 * {@code @Version} 1.0
 **/
@SpringBootApplication
@Slf4j
@EnableFeignClients
@EnableHystrix
public class OrderFeignHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignHystrixMain80.class, args);
        log.info("order-feign-hystrix80 启动成功");
    }
}
