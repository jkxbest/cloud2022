package com.jkx.springcloud.controller;

import com.jkx.springcloud.entities.CommonResult;
import com.jkx.springcloud.entities.Payment;
import com.jkx.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * {@code @name} PaymentController
 * {@code @description} //TODO Payment表现层
 * {@code @author}  jkx
 * {@code @time} 2022/5/25 21:01
 * {@code @version}  1.0
 **/
@RequestMapping("/payment")
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String servicePort;

    @GetMapping("/lb")
    public String getPaymentLB() {
        return servicePort;
    }

    @GetMapping("/feign/timeout")
    public String paymentFeignTimeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            log.info(e.getMessage());
        }
        return servicePort;
    }
    
    @PostMapping("/create")
    public CommonResult<Integer> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("****************插入结果：" + result);
        if (result > 0) {
            return new CommonResult<Integer>(200, "插入数据库成功,servicePort:" + servicePort, result);
        } else {
            return new CommonResult<Integer>(444, "插入数据库失败", null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("****************查询结果：" + payment);
        if (!Objects.isNull(payment)) {
            return new CommonResult<Payment>(200, "查询成功,servicePort:" + servicePort, payment);
        } else {
            return new CommonResult<Payment>(444, "没有对应记录,查询id:" + id, null);
        }
    }
}
