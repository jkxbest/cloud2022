package com.jkx.springcloud.service;

import com.jkx.springcloud.entities.CommonResult;
import com.jkx.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * {@code @ClassName} PaymentFallbackService
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/16 16:55
 * {@code @Version} 1.0
 **/
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}