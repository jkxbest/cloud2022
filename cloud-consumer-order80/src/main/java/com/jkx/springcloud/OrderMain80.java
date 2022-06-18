package com.jkx.springcloud;

import com.jkx.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * {@code @author}  jkx
 * {@code @description} //TODO  用户模块主启动程序
 * {@code @time} 22:37 2022/5/25
 * {@code @params}
 * {@code @return}
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "cloud-payment-service", configuration = MyselfRule.class)
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
        System.out.println("order80 启动成功");
    }
}
