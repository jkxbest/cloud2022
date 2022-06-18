package com.jkx.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * {@code @ClassName} OrderController
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/11 19:21
 * {@code @Version} 1.0
 **/
@RestController
@RequestMapping("/consumer")
public class OrderController {

    public static final String INVOKE_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/payment/consul")
    public String paymentInfo() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);
    }
}
