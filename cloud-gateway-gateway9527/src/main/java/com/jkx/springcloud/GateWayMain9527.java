package com.jkx.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * {@code @ClassName} GateWayMain9527
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/12 21:04
 * {@code @Version} 1.0
 **/
@SpringBootApplication
@Slf4j
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GateWayMain9527.class, args);
        log.info("cloud-gateway9527 启动成功");
    }
}
