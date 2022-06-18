package com.jkx.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * {@code @ClassName}SeataStorageMain2002
 * {@code @Description} //TODO   exclude = DataSourceAutoConfiguration.class 取消数据源的自动创建,
 * * 读取自定义的DataSourceProxyConfig.class类，使用Seata对数据源进行代理
 * {@code @Author} jkx
 * {@code @Data} 2022/6/16 21:27
 * {@code @Version} 1.0
 **/
@Slf4j
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableFeignClients
@EnableDiscoveryClient
public class SeataStorageMain2002 {
    public static void main(String[] args) {
        SpringApplication.run(SeataStorageMain2002.class, args);
        log.info("seata-storage2002 启动成功");
    }
}
