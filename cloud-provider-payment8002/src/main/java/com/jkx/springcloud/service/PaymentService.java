package com.jkx.springcloud.service;

import com.jkx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * {@code @author}  jkx
 * {@code @description} //TODO  Payment业务层接口
 * {@code @time} 20:56 2022/5/25
 * {@code @params}
 * {@code @return}
 **/
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
