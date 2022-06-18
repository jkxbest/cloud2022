package com.jkx.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * {@code @ClassName} OrderZkController
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/11 16:47
 * {@code @Version} 1.0
 **/
@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderZkController {
    public static final String PROVIDER_URL = "http://cloud-provider-service";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/payment/zk")
    public String paymentInfo() {
        return restTemplate.getForObject(PROVIDER_URL + "/payment/zk", String.class);
    }
}
