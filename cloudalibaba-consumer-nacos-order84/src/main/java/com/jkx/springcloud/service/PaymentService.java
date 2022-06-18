package com.jkx.springcloud.service;

import com.jkx.springcloud.entities.CommonResult;
import com.jkx.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * {@code @ClassName} PaymentService
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/16 16:54
 * {@code @Version} 1.0
 **/
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
