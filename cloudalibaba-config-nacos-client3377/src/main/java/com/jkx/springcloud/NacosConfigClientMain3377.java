package com.jkx.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * {@code @ClassName} NacosConfigClientMain3377
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/15 16:24
 * {@code @Version} 1.0
 **/
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClientMain3377.class, args);
        log.info("nacos-config-client3377 启动成功");
    }
}
