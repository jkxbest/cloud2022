package com.jkx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * {@code @ClassName} PaymentController
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/11 19:12
 * {@code @Version} 1.0
 **/
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/consul")
    public String paymentInfo() {
        return "Springcloud with consul:" + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
