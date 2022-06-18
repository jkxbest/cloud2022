package com.jkx.springcloud.service.impl;

import com.jkx.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * {@code @ClassName} PaymentFallbackServiceImpl
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/12 18:16
 * {@code @Version} 1.0
 **/
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_Ok(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
