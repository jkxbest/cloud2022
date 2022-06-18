package com.jkx.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * {@code @name} PaymentController
 * {@code @description} //TODO Payment表现层
 * {@code @author}  jkx
 * {@code @time} 2022/5/25 21:01
 * {@code @version}  1.0
 **/
@RestController
@Slf4j
public class PaymentController {


    @Value("${server.port}")
    private String servicePort;

    @RequestMapping("/payment/zk")
    public String paymentZk() {
        return "springcloud with zookeeper:" + servicePort + "\t" + UUID.randomUUID().toString();
    }


}
