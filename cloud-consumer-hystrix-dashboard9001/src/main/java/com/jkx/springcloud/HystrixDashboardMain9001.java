package com.jkx.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * {@code @ClassName} HystrixDashboardMain9001
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/12 19:59
 * {@code @Version} 1.0
 **/
@SpringBootApplication
@Slf4j
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain9001.class, args);
//        http://localhost:9001/hystrix 访问面板   http://localhost:8001/hystrix.stream 访问8001
        log.info("cloud-hystrix-dashboard9001 启动成功");
    }
}
