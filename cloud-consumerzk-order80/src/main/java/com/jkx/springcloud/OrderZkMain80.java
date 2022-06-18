package com.jkx.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * {@code @ClassName} OrderZkMain80
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/11 16:41
 * {@code @Version} 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class OrderZkMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZkMain80.class,args);
        log.info("orderZK80 启动成功");
    }
}
